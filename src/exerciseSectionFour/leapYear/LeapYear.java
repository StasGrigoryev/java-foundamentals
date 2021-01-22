package exerciseSectionFour.leapYear;

public class LeapYear {

    public static boolean isLeapYear (int year) {

        if (year > 0 && year < 10000) {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            }
            return (year % 400 == 0);
        }
        return false;
    }
}
