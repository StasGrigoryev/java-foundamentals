package exerciseSectionSix.vehicle;

public class Vehicle {

    private String model;
    private String size;

    private int currentVelocity;
    private int currentDirection;


    public Vehicle(String model, String size) {
        this.model = model;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void steer (int currentDirection) {
        this.currentDirection += currentDirection;
        System.out.println("Vehicle.steer(): steering at " + currentDirection + " degrees");
    }

    public void stop () {
        this.currentVelocity = 0;
        System.out.println("Vehicle.stop: The car is stopped. CurrentVelocity: " + this.currentVelocity);
    }

    public void move (int currentVelocity, int currentDirection) {

        this.currentDirection = currentDirection;
        this.currentVelocity = currentVelocity;
        System.out.println("Vehicle.move(): velocity " + this.currentVelocity + " direction "
                + this.currentDirection);
    }

}
