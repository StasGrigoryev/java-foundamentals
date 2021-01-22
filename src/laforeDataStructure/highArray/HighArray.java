package laforeDataStructure.highArray;

public class HighArray {
    private int[] arr;
    private int nElems;

    public HighArray(int max) {
        arr = new int[max];
        nElems = 0;
    }

    public boolean find (int searchKey) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (arr[i] == searchKey) {
                break;
            }
        }
        if (i == nElems) {
            return false;
        } else System.out.println("The value " + arr[i] + " was found");
        return false;
    }

    public void insert (int value) {
        arr[nElems++] = value;
    }

    public boolean delete (int value) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (arr[i] == value) {
                break;
            }
        }
        if (i == nElems) {
            System.out.println ("The element " + value + " was not found");
            return false;
        } else {
            for (int j = i; j < nElems - 1; j++) {
                arr[j] = arr[j + 1];
            }
            nElems--;
            System.out.println("The element " + value + " was found at index " + (i+1) + " and has been deleted successfully");
        }
        return true;
    }

    public void print() {
        int i;
        for (i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
