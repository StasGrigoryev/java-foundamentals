package challenges.problems;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        while (i <= 10) {

            System.out.println("Enter number #" + i + ":");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                i++;
                sum += number;
            } else {
                    System.out.println("Invalid Value");
                }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The sum is " + sum);
    }
}
