package laforeDataStructure.lowArray;

public class LowArrayTest {

    public static void main(String[] args) {

        LowArray arr = new LowArray(100);
        int nElems = 0;
        int j;

        arr.setElement(22);
        arr.setElement(25);
        arr.setElement(32);
        arr.setElement(64);
        arr.setElement(90);
        arr.setElement(42);
        arr.setElement(49);
        arr.setElement(50);
        arr.setElement(69);
        arr.setElement(80);
        nElems = 10;


        for(j=0;j<nElems;j++) {
            System.out.print(arr.getElement(j) + " ");
        }
        System.out.println("");

        for (j = 0; j < nElems; j++) {
            if (arr.getElement(j) == 80) {
                break;
            }
        }

        if (j == nElems) {
            System.out.println(j);
        } else {
            for (int k = j; k < nElems; k++) {
                arr.setElement(k, arr.getElement(k + 1));
            }
            nElems--;
        }

        for(j=0;j<nElems;j++) {
            System.out.print(arr.getElement(j) + " ");
        }
    }
}
