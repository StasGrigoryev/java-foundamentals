package arrays.minElement;

import java.util.Scanner;

public class ArrayMinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers (int size) {
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int current : arr) {
            if (current < min) {
                min = current;
            }
        }
        return min;
    }
}
