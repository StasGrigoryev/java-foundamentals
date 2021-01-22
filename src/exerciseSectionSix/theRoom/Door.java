package exerciseSectionSix.theRoom;

public class Door {
    private Dimensions dimensions;
    private String material;
    private String color;

    public void open (boolean open) {
        if (open) {
            System.out.println("The door is unlocked");
        } else
            System.out.println("The door is locked");
    }

    public Door(Dimensions dimensions, String material, String color) {
        this.dimensions = dimensions;
        this.material = material;
        this.color = color;
    }
}
