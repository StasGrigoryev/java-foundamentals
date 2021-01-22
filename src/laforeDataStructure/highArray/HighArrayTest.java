package laforeDataStructure.highArray;

public class HighArrayTest {

    public static void main(String[] args) {
        HighArray arr = new HighArray(50);

        arr.insert(10);
        arr.insert(15);
        arr.insert(12);
        arr.insert(19);
        arr.insert(30);
        arr.insert(50);
        arr.insert(4);
        arr.insert(1);

        arr.print();

        arr.find(19);
        arr.delete(12);
    }
}
