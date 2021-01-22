package exerciseSectionSix.polymorphism;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;

    public String startEngine() {
        return "Car.startEngine(): engine has been started";
    }

    public void stop() {
        this.speed = 0;
        System.out.println("Car.stop(): The car has stopped. Current speed is " + this.getSpeed());
    }

    public void accelerate(int gas) {
        if (gas == 0) {
            stop();
        }
        if (gas > 0) {
            this.speed += gas;
            System.out.println("Car.accelerate(): gas pedal was pressed. Current speed is " + this.getSpeed());
        }
    }

    public void brake(int brake) {

        if (brake == 100) {
            stop();
        }
        if (brake >= 0 && brake <= 100) {
            this.speed *= (1 - ((double) brake / 100));
        }
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.speed = 0;
    }
}

class Toyota extends Car{

    @Override
    public String startEngine() {
        return "Toyota.startEngine(): Toyota engine is running like a beast!";
    }

    public Toyota() {
        super("corolla", 8);
    }

}

class Reno extends Car {

    public Reno() {
        super("Logan", 8);
    }

    @Override
    public String startEngine() {
        return "Reno.startEngine(): Reno engine is working now. Let's roll.";
    }
}

class VolksVagen extends Car {

    public VolksVagen() {
        super("Jetta", 16);
    }

    @Override
    public String startEngine() {
        return "VolksVagen.startEngine(): The motor is roaring like a dinosaur.";
    }
}

class Main {
    public static void main(String[] args) {

        for (int i = 1; i<=10; i++) {
            Car car = random();
            System.out.println("The car #" + i + "s speed: " + car.getSpeed() + "." + "\n" + car.startEngine());
        }
    }

    public static Car random () {

        int random = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated is: " + random);
        switch (random) {
            case 1:
                return new Toyota();
            case 2:
                return new Reno();
            case 3:
                return new VolksVagen();
            default: return null;
        }
    }
}

