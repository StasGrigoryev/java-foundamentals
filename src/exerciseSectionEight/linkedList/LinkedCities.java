package exerciseSectionEight.linkedList;

import java.util.LinkedList;
import java.util.*;

public class LinkedCities {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Burbank");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Sidney");
        addInOrder(placesToVisit,"Almetyevsk");
        addInOrder(placesToVisit,"Odyssey");
        addInOrder(placesToVisit,"Abjure");
        printCities(placesToVisit);

        addInOrder(placesToVisit,"Ingrighterschtern");
        addInOrder(placesToVisit,"Jokerit");
        printCities(placesToVisit);

        placesToVisit.add(2,"Ursula");
        printCities(placesToVisit);
        visit(placesToVisit);
    }

    public static void printCities(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visit " + i.next());
        }
        System.out.println("=========================");
    }

    public static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparision = stringListIterator.next().compareTo(newCity);

            if (comparision == 0) { // equal, do not add
                System.out.println(newCity + " is already in the list");
                return false;
            } else if (comparision > 0) { // newCity should be before the current one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparision < 0) {
                //move to the next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    public static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities in itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Vacation is over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                        break;
                case 2:
                    if(goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
