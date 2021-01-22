package exerciseSectionFour.centimetersCalculator;

public class CentimetersCalculator {
    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {

        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double centimeters = ((feet * 12 + inches) * 2.54);
            System.out.println(feet + "ft and " + inches + "in = " + centimeters + " cm");
            return centimeters;
        }
        System.out.println("Invalid Value");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {

        if (inches >= 0) {
            int feet = (int) (inches / 12);
            int remainder = (int) inches % 12;
            System.out.println(inches + "in = " + feet + " feet and " + remainder + " is remaining");
            return calcFeetAndInchesToCentimeters(feet, remainder);
        }
        System.out.println("Invalid Value!");
        return -1;
    }
}
