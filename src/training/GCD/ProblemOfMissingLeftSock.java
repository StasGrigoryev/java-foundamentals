package training.GCD;

public class ProblemOfMissingLeftSock {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(24, 36));
    }

    public static int getGreatestCommonDivisor (int a, int b) {

        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
