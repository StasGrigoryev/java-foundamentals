package exerciseSctionFive.hasSharedDigit;

public class HasSharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(11, 91));
    }

    public static boolean hasSharedDigit (int numOne, int numTwo) {

        if (numOne < 10 || numTwo < 10 || numOne > 99 || numTwo > 99) {
            return false;
        }

        while (numOne > 0) {
            int numberTwo = numTwo;
            int digitOne = numOne % 10;
            while (numberTwo > 0) {
                int digitTwo = numberTwo % 10;
                if (digitOne == digitTwo) {
                    System.out.println(digitOne);
                    return true;
                }
                numberTwo /= 10;
            }
            numOne /= 10;
        }
        return false;
    }
}
