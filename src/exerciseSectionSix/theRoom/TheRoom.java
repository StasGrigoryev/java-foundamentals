package exerciseSectionSix.theRoom;

public class TheRoom {
    private int size;
    private int temperature;
    private boolean isDark;
    private boolean isStuffy;
    private Window window;
    private Table table;
    private Door door;
    private Bed bed;
    private Light light;
    private Heater heater;

    public void heatUp (int temperature) {
            heater.heatOn(temperature);
    }

    public void lightUp (boolean isDark) {
        light.lightIsOn(isDark);
    }

    public void airOut (boolean isStuffy) {
        window.open(isStuffy);
    }

    public int getTemperature() {
        return temperature;
    }

    public boolean isDark() {
        return isDark;
    }

    public boolean isStuffy() {
        return isStuffy;
    }

    public TheRoom(int size, Window window, Table table, Door door, Bed bed, Light light, Heater heater) {
        this.size = size;
        this.temperature = 20;
        this.isDark = false;
        this.isStuffy = false;
        this.window = window;
        this.table = table;
        this.door = door;
        this.bed = bed;
        this.light = light;
        this.heater = heater;
    }
}
