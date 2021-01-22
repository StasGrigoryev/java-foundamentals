package laforeDataStructure.orderedArray;

public class OrderedArray {
    private int[] arr;
    private int nElems;


    public OrderedArray(int max) {
        arr = new int[max];
        nElems = 0;
    }

    public void insert (int value) {
        arr[nElems++] = value;
    }

    public void insertNicely (int value) {
        int position = 0;

        for (int i = 0; i < nElems; i++) {
            if (arr[i] > value) {
                position = i;
                break;
            }
        }
        nElems++;
        for (int i = nElems - 2; i >= position; i--) {
            arr[i+1] = arr[i];
        }
        arr[position] = value;
    }


    public void sort () {
        int t = 0;
        for (int i = 0; i < nElems; i++) {
            for (int j = i+1; j < nElems; j++) {
                if (arr[j] < arr[i]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

    public int searchBinary (int number) {
        int upBound = nElems - 1;
        int lowBound = 0;
        int guess;
        while (true) {
            guess = (upBound - lowBound) / 2;
            if (number == arr[guess]) {
                System.out.println("The number " + number + " is at the index " + guess);
                return guess;
            } else if (lowBound > upBound) {
                System.out.println("No such number");
                return -1;
            } else {
                if (number > arr[guess]) {
                    lowBound = guess + 1;
                } else {
                    upBound = guess - 1;
                }
            }
        }
    }

    public void print () {
        for(int i = 0; i < nElems; i++) {
        System.out.print(arr[i] + " ");
    }
        System.out.println("");
    }

}
