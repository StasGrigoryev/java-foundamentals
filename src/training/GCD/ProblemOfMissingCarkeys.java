package training.GCD;

public class ProblemOfMissingCarkeys {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(9, 36));
    }

    public static int getGreatestCommonDivisor (int a, int b) {

            if (b == 0) {
                return a;
            }
        return getGreatestCommonDivisor(b ,a % b);
    }
}
