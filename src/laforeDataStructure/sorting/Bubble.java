package laforeDataStructure.sorting;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {6,9,10,4,2,1,3,7,8,5};
        sort(arr);
       for (int i : arr) {
           System.out.print(i + " ");
       }
    }

    public static int[] sort(int[] arr) {

        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        return arr;
    }
}
