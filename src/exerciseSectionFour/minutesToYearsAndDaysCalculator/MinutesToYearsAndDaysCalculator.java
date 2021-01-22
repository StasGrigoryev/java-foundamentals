package exerciseSectionFour.minutesToYearsAndDaysCalculator;

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes >= 0) {
            int days = (int) (minutes / (24 * 60));
            int years = days / 365;
            int daysRemain = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + daysRemain + " d");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
