package training.clothes;

public class Clothes {

    private int size;
    private String color;
    private String tissue;

    public boolean getDirty () {
        System.out.println("It's time to throw me to washing machine");
        return true;
    }

    public Clothes(int size, String color, String tissue) {
        this.size = size;
        this.color = color;
        this.tissue = tissue;
    }
}
