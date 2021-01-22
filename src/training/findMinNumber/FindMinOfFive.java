package training.findMinNumber;

public class FindMinOfFive {

    public static void main(String[] args) {
        System.out.println(min(2,3,6,-10,1));
    }

    public static int min(int a, int b, int c, int d, int e) {

        int minimum = 0;
        int[] arr = {a, b, c, d, e};
        int i = 0;
        while (i <= arr.length) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    minimum = arr[i];
                } else minimum = arr[j];
            }
            i++;
        }
        return minimum;
    }

}
