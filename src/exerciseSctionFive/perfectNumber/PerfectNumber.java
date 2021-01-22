package exerciseSctionFive.perfectNumber;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(0));
    }

    public static boolean isPerfectNumber (int number) {

        if (number < 1) {
            return false;
        }

        int temp = number - 1;
        int perfect = 0;

        while (temp > 0) {
            if (number % temp == 0) {
                perfect += temp;
            }
            temp--;
        }
        return (perfect == number);
    }

}
