package exerciseSectionFour.teenNumberChecker;

public class TeenNumberCheckerTest {

    public static void main(String[] args) {
        boolean numberOne = TeenNumberChecker.hasTeen(14,10,2);
        boolean numberTwo = TeenNumberChecker.hasTeen(19);
        System.out.println(numberOne);
        System.out.println(numberTwo);
    }
}
