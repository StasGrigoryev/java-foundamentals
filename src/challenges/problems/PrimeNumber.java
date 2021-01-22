package challenges.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(21));
        int primeNumCount = 0;
        for (int i = 2; i < 30; i++) {
            if (PrimeNumber.isPrimeNumber(i)) {
                primeNumCount++;
                System.out.println("Number " + i + " is a prime number");
            }
            if (primeNumCount == 20) {
                System.out.println("Exiting fot loop with " + primeNumCount + " prime numbers");
                break;
            }
        }



    }

    public static boolean isPrimeNumber (int n) {

        if (n == 1) {
            return false;
        }// проверка простое число или нет

        for(int i = 2; i < Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
