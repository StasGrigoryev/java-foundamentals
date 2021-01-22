package training.clothes;

public class TShirt extends Clothes {

    private boolean withPrint;
    private int sleeveLength;

    public TShirt(int size, String color, String tissue, boolean withPrint, int sleeveLength) {
        super(size, color, tissue);
        this.withPrint = withPrint;
        this.sleeveLength = sleeveLength;
    }

    @Override
    public boolean getDirty () {
        System.out.println("Your shirt is dirty. Put it in the wash.");

        return true;
    }
}
