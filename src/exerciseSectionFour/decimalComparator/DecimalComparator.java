package exerciseSectionFour.decimalComparator;
import java.lang.Math;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo) {
        int one = (int) (numberOne * 1000);
        int two = (int) (numberTwo * 1000);

        return (one == two);
    }

    public static boolean areEqualByFourDecimalPlaces (double numOne, double numTwo) {
        double threshold = 0.0001;

        return (Math.abs(numOne - numTwo) < threshold);
    }
}
