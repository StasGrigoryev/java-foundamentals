package exerciseSectionEight.linkedList;

import java.util.*;

public class Test {

    private int number;
    private static int count;

    public static int returnCat() {
        return count;
    }

    static class Cat {
        private String name;

        public void getNumber() {
            System.out.println("The number is " + Test.count);
        }
    }

    public static void main(String[] args) {

        int i = 10000;
        byte b = (byte) i;
        System.out.println(b);
        double d = 1000.0101;
        long l = (long) d;
        double dd = l;
        System.out.println(l);


    }
}

