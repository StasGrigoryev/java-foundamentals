package exerciseSctionFive.greatestCommonDivisor;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(27, 36));
    }


    public static int getGreatestCommonDivisor (int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }


        int temp;
        while (second != 0) { // пока b не ноль (14 и 17)
            temp = second; // 1) t = 17  2) t = 14 3) t = 3
            second = first % second; // 1) b = 14  2) b = 3  3) b = 2
                        // остаток от деления первого на второе (он станет меньше либо ноль)
            first = temp; // 1) // а = 17  2) а = 14
                        // a становится b, который был в начале
        }
        return first;
    }
}




