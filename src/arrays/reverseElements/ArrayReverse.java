package arrays.reverseElements;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void reverse (int[] arr) {
        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[j-i];
            arr[j-i] = t;
        }
    }
}
