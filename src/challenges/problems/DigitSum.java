package challenges.problems;

public class DigitSum {


    public static void main(String[] args) {

        System.out.println(sumDigits(-11));
    }

    public static int sumDigits (int number) {

        if (number >= 0 && (number / 10) != 0) {

            int sum = 0;
            int digit;

            while (number > 0) {

                digit = number % 10;
                sum += digit;
                number /= 10;
            }
            return sum;
        }
        return -1;
    }

}
