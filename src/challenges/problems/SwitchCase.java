package challenges.problems;

public class SwitchCase {
    public static void main(String[] args) {
        char switchChar = 'B';

        switch (switchChar) {
            case 'A':
                System.out.println("Tonight! We Are Young!!!");
                break;
            case 'B':
                System.out.println(" So let's set the world on fire!");
                break;
            case 'C': case 'D' : case 'E':
                System.out.println("We can burn brighter...");
                break;

            default:
                System.out.println("no characters are found");

        }
        String month = "January";
        switch (month.toLowerCase()) { // делает все буквы в нижнем регистре
            case "january" : case "february" : case "december" :
                System.out.println("It's winter");
                break;
            case "march" : case "april" : case "may" :
                System.out.println("It's spring");
                break;
            case "june" : case "july" : case "august" :
                System.out.println("It's summer");
                break;
            case "september" : case "october" : case "november" :
                System.out.println("It's autumn");

            default :
                System.out.println("It's not a month");
        }
    }
}
