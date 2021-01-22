package exerciseSectionSix.theRoom;

public class Window {
    private Dimensions dimensions;
    private String material;
    private int panes;

    public void open (boolean open) {
        if (open) {
            System.out.println("The window is opened");
        } else
            System.out.println("The window is closed");
    }

    public Window(Dimensions dimensions, String material, int panes) {
        this.dimensions = dimensions;
        this.material = material;
        this.panes = panes;
    }
}
