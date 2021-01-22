package exerciseSctionFive.numberToWords;

public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(1000);

    }

    public static void numberToWords (int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int newNumber = reverse(number);
        int zeros = getDigitCount(number) - getDigitCount(newNumber);
        String zerosString = "";

        for (int i = 0; i < zeros; i++) {
            if (i == 0) {
                zerosString += "Zero";
            } else
                zerosString += " Zero";
        }

        String toPrint = "";
        int digitCount = getDigitCount(newNumber);

        for (int i = 0; i < digitCount; i++) {

            int digit = newNumber % 10;

            switch (digit) {
                case 0:
                    if (toPrint.equals("")) {
                        toPrint = toPrint + "Zero";
                    } else {
                        toPrint = toPrint + " Zero";
                    }
                    break;
                case 1:
                    if (toPrint.equals("")) {
                        toPrint = toPrint + "One";
                    } else {
                        toPrint = toPrint + " One";
                    }
                    break;
                case 2:
                    if (toPrint.equals("")) {
                        toPrint = toPrint + "Two";
                    } else {
                        toPrint = toPrint + " Two";
                    }
                    break;
                case 3:
                    if (toPrint.equals("")) {
                        toPrint = toPrint + "Three";
                    } else {
                        toPrint = toPrint + " Three";
                    }
                    break;
                case 4:
                    if (toPrint.equals("")) {
                        toPrint = toPrint + "Four";
                    } else {
                        toPrint = toPrint + " Four";
                    }
                    break;
                case 5:
                    if (toPrint.equals("")) {
                        toPrint = toPrint + "Five";
                    } else {
                        toPrint = toPrint + " Five";
                    }
                    break;
                case 6:
                    if (toPrint.equals("")) {
                        toPrint = toPrint + "Six";
                    } else {
                        toPrint = toPrint + " Six";
                    }
                    break;
                case 7:
                    if (toPrint.equals("")) {
                        toPrint = toPrint + "Seven";
                    } else {
                        toPrint = toPrint + " Seven";
                    }
                    break;
                case 8:
                    if (toPrint.equals("")) {
                        toPrint = toPrint + "Eight";
                    } else {
                        toPrint = toPrint + " Eight";
                    }
                    break;
                case 9:
                    if (toPrint.equals("")) {
                        toPrint = toPrint + "Nine";
                    } else {
                        toPrint = toPrint + " Nine";
                    }
                    break;
                default:
                    break;
            }
            newNumber /= 10;
        }
        if (zeros != 0) {
            System.out.println(toPrint + " " + zerosString);
        }
        else System.out.println(toPrint);
    }

    public static int reverse (int number) {

        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
        }

        number = Math.abs(number);
        int newNumber = 0;
        while (number > 0) {

            int digit = number % 10;
            number /= 10;
            newNumber += digit;

            if (number == 0) {
                break;
            }

            newNumber *= 10;
        }
        if (isNegative) {
            return -newNumber;
        }
        return newNumber;
    }

    public static int getDigitCount (int number) {

        if (number < 0) {
            return -1;
        }

        int digitCount = 0;

        do {
            number /= 10;
            digitCount++;
        } while (number != 0);
        return digitCount;
    }

}
