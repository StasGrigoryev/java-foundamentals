package challenges.problems;

public class IsEvenNumber {

    public static void main(String[] args) {
        int evenCount = 0;
        int number = 0;
        int endNumber = 20;
        while (number <= 20) {

            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            evenCount++;
            if (evenCount == 5) {
                break;
            }
            System.out.println(number + " is even number");
        }
        System.out.println("The total of even numbers is " + evenCount);
    }


    public static boolean isEvenNumber (int num) {

        return ((num % 2) == 0);
    }
}
