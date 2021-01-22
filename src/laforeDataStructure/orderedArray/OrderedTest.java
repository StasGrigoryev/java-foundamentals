package laforeDataStructure.orderedArray;

public class OrderedTest {

    public static void main(String[] args) {



        OrderedArray arr = new OrderedArray(50);

        arr.insert(6);
        arr.insert(14);
        arr.insert(1);
        arr.insert(5);
        arr.insert(23);
        arr.insert(12);
        arr.insert(40);
        arr.insert(2);
        arr.insert(10);
        arr.insert(30);

        arr.sort();
        arr.print();
        arr.searchBinary(2);
        arr.print();
    }
}
