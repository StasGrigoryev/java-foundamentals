package exerciseSctionFive.inputCalculator;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();


    }


    public static void inputThenPrintSumAndAverage () {

        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        long avg = 0;
        int count = 0;

        while (true) {

            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
        }
        avg = Math.round((double)sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
