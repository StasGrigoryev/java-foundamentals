package arrays.minElement;

public class Main {
    public static void main(String[] args) {

        int[] arr = ArrayMinimumElement.readIntegers(5);

        int minimum = ArrayMinimumElement.findMin(arr);
        System.out.println(minimum);
    }
}
