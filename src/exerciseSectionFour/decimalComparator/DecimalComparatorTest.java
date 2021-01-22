package exerciseSectionFour.decimalComparator;

public class DecimalComparatorTest {
    public static void main(String[] args) {
        boolean compare = DecimalComparator.areEqualByThreeDecimalPlaces(1.238567, 1.2348769);
        System.out.println(compare);
        boolean compare2 = DecimalComparator.areEqualByFourDecimalPlaces(1.234567, 1.234688);
        System.out.println((Math.abs(1.23456 - 1.234523)));
        System.out.println(compare2);
    }
}
