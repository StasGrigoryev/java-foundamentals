package challenges.problems;

public class StringFormat {

    public static void main(String[] args) {

    for (int i = 8; i >= 2; i--) {
        String interest = String.format("%.2f", calculateInterest(10000.0, i));
        System.out.println("10,000 at " + i + "% interest = " + interest);
    }








    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
