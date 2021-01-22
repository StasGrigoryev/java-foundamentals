package exerciseSctionFive.palindrome;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1001));
    }


    public static boolean isPalindrome (int number) {

        int reverse = 0;
        number = Math.abs(number);
        int startNumber = number;

        while (number > 0) {
            int digit = number % 10;
            reverse += digit;
            number /= 10;
            if (number == 0) {
                break;
            }
            reverse *= 10;
        }
        return (startNumber == reverse);
    }

}
