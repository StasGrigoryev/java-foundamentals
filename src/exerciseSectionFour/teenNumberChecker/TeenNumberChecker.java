package exerciseSectionFour.teenNumberChecker;

public class TeenNumberChecker {
    public static boolean hasTeen (int numOne, int numTwo, int numThree) {

        return ((numOne >= 13 && numOne <= 19) || (numTwo >= 13 && numTwo <= 19) || (numThree >= 13 && numThree <= 19));

    }
    public static boolean hasTeen (int numFour) {
        return (numFour >= 13 && numFour <= 19);
    }
}
