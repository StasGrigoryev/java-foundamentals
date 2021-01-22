package arrays;

import java.util.Scanner;

public class ArraysReview {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int size) {
        System.out.println("Enter " + size + " integer values:\r");
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int[] sortIntegers(int[] array) {
        int t;
        for(int i = 0; i <array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        return array;
    }

    public static void printArray (int[] array) {

        for(int i = 0; i < array.length; i++) {
            System.out.print (array[i] + " ");
        }
        System.out.println("");
    }


}
