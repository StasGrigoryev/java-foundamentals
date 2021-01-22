package challenges.problems;

public class methodOne {
    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 4, 50);
        System.out.println("Your score is " + highScore);
        displayHighScorePosition("Peter", calculateHighScorePosition(1500));
        displayHighScorePosition("Keter", calculateHighScorePosition(900));
        displayHighScorePosition("Deter", calculateHighScorePosition(400));
        displayHighScorePosition("Seter", calculateHighScorePosition(50));
    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1; // если gameOver == true, то до этого return-a java не дойдет
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " is on " + position + " position of the champions table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
