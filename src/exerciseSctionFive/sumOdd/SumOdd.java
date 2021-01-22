package exerciseSctionFive.sumOdd;

public class SumOdd {

    public static void main(String[] args) {

        System.out.println(sumOdd(1, 10));


    }

    public static boolean isOdd (int number) {

        if (number > 0) {

            return ((number % 2) != 0);
        }
        return false;
    }

    public static int sumOdd (int start, int end) {

        if ((start >= 0) && (end >= 0) && (end >= start)) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
