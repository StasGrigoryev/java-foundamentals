package exerciseSctionFive.allFactors;

public class AllFactors {

    public static void main(String[] args) {

        printFactors(90);

    }

    public static void printFactors (int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int temp = 1;
        String printString = "";
        while (temp <= number) {
            if (number % temp == 0) {
                if (printString.isEmpty()) {
                    printString = Integer.toString(temp);
                } else
                    printString = printString + " " + temp;
            }
            temp++;
        }
        System.out.println(printString);
    }
}
