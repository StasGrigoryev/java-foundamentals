package training.GCD;

public class ProblemOfMissingGummies {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 6));
    }


    public static int getGreatestCommonDivisor (int numOne, int numTwo) {

        while (numOne != numTwo) {
           if (numOne > numTwo) {
               numOne = numOne - numTwo;
           } else {
               numTwo = numTwo - numOne;
           }
        }
        return numOne;
    }
}
