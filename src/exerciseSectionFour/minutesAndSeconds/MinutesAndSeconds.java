package exerciseSectionFour.minutesAndSeconds;

public class MinutesAndSeconds {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationString (int minutes, int seconds) {
        if ((minutes >=0) && (seconds >= 0 && seconds <= 59)) {
            int remainder = minutes % 60;
            int hours = minutes / 60;
            String time = hours + " : " + remainder + " : " + seconds;
            System.out.println(time);
            return time;
        }
        System.out.println(INVALID_VALUE_MESSAGE);
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString (int seconds) {
        if (seconds >= 0) {
            int remainder = seconds % 60;
            int minutes = seconds / 60;
            String time = minutes + " min " + remainder + " s";
            System.out.println(time);
            return MinutesAndSeconds.getDurationString(minutes,remainder);
        }
        System.out.println(INVALID_VALUE_MESSAGE);
        return INVALID_VALUE_MESSAGE;
    }
}
