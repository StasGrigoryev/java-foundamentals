package challenges.problems;

public class Operators {

    public static void main(String[] args) {

        Operators oper = new Operators();


        int topScore = 80;
        if (topScore < 100) {

            System.out.println("You got the high score!!! We have a winner! WE HAVE A WINNER!!!!11");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than secondTopScore and less than 100");
        }
            boolean currentBooleanValue = false;
            boolean previousBooleanValue = currentBooleanValue ? true : false;
            System.out.println("previousBooleanValue is " + previousBooleanValue);
            // выведет false

            int clientAge = 20;
            boolean isEighteenOrOver = (clientAge  >= 18) ? true : false;

            if (isEighteenOrOver) {
                System.out.println("The client is over 18");
            } else System.out.println("The client is less than 18");
                                                        //выведет первое

            if (oper instanceof Operators) { //проверка принадлежности объекта к классу
                System.out.println("YEEEEEAAAAAHHH!!!!!11");
                                            //выведет yeah!
            }

            double firstValue = 20.00d;
            double secondValue = 80.00d;
            double result = ((firstValue + secondValue) * 100.00d ) % 40;
            System.out.println("result is " + result);

            boolean isZero = (result == 0) ? true : false;
            if (!isZero) {
                System.out.println("Got some reminder");
            }

    }
}
