package exerciseSectionSix.theRoom;

public class Main {

    public static void main(String[] args) {

        Bed bed = new Bed(new Dimensions(1.2,6.0,6.6));
        Door door = new Door(new Dimensions(7.0,1.4, 0.2), "wood", "natural");
        Table table = new Table(new Dimensions(2.0,5.0,4.5), "wood", "white");
        Window window = new Window(new Dimensions(5.0,5.0, 0.5),"plastic", 3);
        Light light = new Light();
        Heater heater = new Heater();

        TheRoom room = new TheRoom(20, window, table, door, bed, light, heater);

        room.airOut(room.isStuffy());
        room.heatUp(room.getTemperature());
        room.lightUp(room.isDark());


    }
}
