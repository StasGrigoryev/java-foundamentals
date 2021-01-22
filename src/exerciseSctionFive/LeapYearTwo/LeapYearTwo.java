package exerciseSctionFive.LeapYearTwo;

public class LeapYearTwo {
    public static boolean isLeapYear (int year) {

        if (year > 0 && year < 10000) {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            }
            return (year % 400 == 0);
        }
        return false;
    }

    public static int getDaysInMonth (int month, int year) {
        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }
                default:
                    return 31;
            }
        }
        return -1;
    }
 }
