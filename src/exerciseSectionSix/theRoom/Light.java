package exerciseSectionSix.theRoom;

public class Light {
    private int brightness;

    public void lightIsOn (boolean on) {
        if (on) {
            brightness += 1000;
            System.out.println("It's dark outside. Light is on with brightness " + brightness + " Kelvins");
        } else {
            brightness = 0;
            System.out.println("It's not dark outside. Light is off");
        }
    }

    public Light() {
        this.brightness = 0;
    }
}
