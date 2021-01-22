package exerciseSectionSix.thePC;

public class Case {
    private String model;
    private String manufacturer;
    private int voltage;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, int voltage, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.voltage = voltage;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
