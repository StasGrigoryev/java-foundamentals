package exerciseSectionSix.theRoom;

public class Heater {
    private int power;

    public void heatOn (int temperature) {
        if (temperature < 20) {
            power += 50;
            System.out.println("The heater is on");
        } else
            power = 0;
            System.out.println("The heater is off");
    }

    public Heater(int power) {
        if (power < 0) {
            this.power = 0;
        } else if (power > 100) {
            this.power = 100;
        } else
            this.power = power;
    }

    public Heater () {
        this.power = 0;
    }
}
