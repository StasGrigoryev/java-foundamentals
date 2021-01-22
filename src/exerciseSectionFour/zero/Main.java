package exerciseSectionFour.zero;

public class Main {

    public static void main(String[] args) {

	int myValue = 1000;
	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
	int intOverflow = myMaxIntValue + 5;
	long myLongValue = Long.MAX_VALUE;
	byte myMinByteValue = Byte.MIN_VALUE;
	

    System.out.println("Integer Minimum Value: " + myMinIntValue);
    System.out.println("Integer Maximum Value: " + myMaxIntValue);
    System.out.println("myMaxIntValue + 1: " + intOverflow);
    System.out.println(myLongValue);
    System.out.println(myMinByteValue / 2);


    }
}
