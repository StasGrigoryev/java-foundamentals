package laforeDataStructure.lowArray;

public class LowArray {
    private int[] arr;
    private int index = 0;

    public LowArray (int size) {
        arr = new int[size];
    }

    public void setElement (int value) {
        if (index >= arr.length) {
            System.out.println("You assigned all elements");
        } else {
            arr[index] = value;
            index++;
        }
    }

    public void setElement (int index, int value) {
        arr[index] = value;
    }

    public int getElement (int index) {
        return arr[index];
    }
}
