package collections.Adventure;

import java.util.*;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();
    private Map<String, String> vocabulary;

    public Main() {
        vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Map<String, String> vocabulary = main.vocabulary;

        Map<String, Integer> tempExits = new HashMap<>();
        locations.put(0, new Location(0,
                "You are sitting in front of a computer learning Java", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("W", 2);
        tempExits.put("E", 3);
        tempExits.put("S", 4);
        tempExits.put("N", 5);
        locations.put(1, new Location(1,
                "You are standing at the end of a road before a small brick building", tempExits));

        //we can use the same variable to create a new map and pass it to the Location constructor
        tempExits = new HashMap<>();
        tempExits.put("N", 5);
        locations.put(2, new Location(2,
                "You are at the top of a hill", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("W", 1);
        locations.put(3, new Location(3,
                "You are inside a building, a well house for a small spring", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("N", 1);
        tempExits.put("W", 2);
        locations.put(4, new Location(4,
                "You are in a valley beside a stream", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("S", 1);
        tempExits.put("W", 2);
        locations.put(5, new Location(5,
                "You are in the forest", tempExits));

        main.command();
    }

    public void command() {
        Scanner scanner = new Scanner(System.in);

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String input = scanner.nextLine().toUpperCase();
            if (input.length() > 1) {
                String[] words = input.toUpperCase().split(" ");
                for (String s : words) {
                    if (vocabulary.containsKey(s)) {
                        input = vocabulary.get(s);
                        loc = exits.get(input);
                        break;
                    }
                }
            }

            if (!input.isEmpty() && exits.containsKey(input)) {
                loc = exits.get(input);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }

    }
}
