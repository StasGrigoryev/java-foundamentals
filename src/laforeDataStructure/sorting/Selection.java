package laforeDataStructure.sorting;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {6,9,10,4,2,1,3,7,8,5};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

//    public static int[] sort(int[] arr) {
//        int indexOfMin;
//        for (int i = 0; i < arr.length-1; i++) {
//            indexOfMin = i;
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[j] < arr[indexOfMin]) {
//                    indexOfMin = j;
//                }
//            }
//            int t = arr[i];
//            arr[i] = arr[indexOfMin];
//            arr[indexOfMin] = t;
//        }
//
//        return arr;
//    }

    public static void sort(int[] arr) {
        int min = 0;
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (arr[min] < arr[i]) {
                t = arr[i];
                arr[i] = arr[min];
                arr[min] = t;
            }
        }
    }
}

