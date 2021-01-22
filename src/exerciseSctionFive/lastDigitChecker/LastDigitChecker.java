package exerciseSctionFive.lastDigitChecker;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(11,255,461));
        System.out.println(19 % 1);
    }

    public static boolean hasSameLastDigit (int numOne, int numTwo, int numThree) {

        if (numOne < 10 || numOne > 1000 || numTwo < 10 || numTwo > 1000 || numThree < 10 || numThree > 1000) {
            return false;
        }

        int[] arr = {numOne, numTwo, numThree};
        int i = 0;

        while (i < arr.length) {
            arr[i] %= 10;
            i++;
        }
        return ((arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]));
    }

    public  static boolean isValid (int number) {
        return (number >= 10 && number <= 1000);
    }
}


