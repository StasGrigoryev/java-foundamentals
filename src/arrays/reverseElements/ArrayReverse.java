package arrays.reverseElements;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] arr = {4,7,9,3,12,7,16,5};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void reverse (int[] arr) {
        int j = arr.length - 1;
        for (int i = 0; i <= arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[j-i];
            arr[j-i] = t;
        }
    }
}
