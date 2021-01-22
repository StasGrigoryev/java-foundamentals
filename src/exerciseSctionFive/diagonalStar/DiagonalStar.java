package exerciseSctionFive.diagonalStar;

public class DiagonalStar {

    public static void main(String[] args) {

        printSquareStar(8);
    }

    public static void printSquareStar (int number) {

        if (number >= 5) {

            int row = 1;

            while (row <= number) {
                for (int column = 1; column <= number; column++) {
                    if (row == 1 || row == number || column == 1 || column == number
                            || column == row || column == number - row + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                row++;
            }
        } else
            System.out.println("Invalid Value");
    }
}
