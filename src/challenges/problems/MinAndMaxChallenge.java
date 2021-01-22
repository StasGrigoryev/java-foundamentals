package challenges.problems;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE; // to avoid min value from not being changed, when it's zero,
        // user may not enter value greater than zero and it'll stay zero
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while (true) {

            System.out.println("Enter value:");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int inputLine = scanner.nextInt();
//                if (first) {
//                    min = inputLine;
//                    max = inputLine;
//                    first = false;
//                }
                if (inputLine < min) {
                    min = inputLine;
                } else if (inputLine > max) {
                    max = inputLine;
                } else {
                    continue;
                }
            } else {
                break;
              }
            scanner.nextLine();
        }
        System.out.println("The min is: " + min + " and the max is: " + max);
        scanner.close();
    }
}
