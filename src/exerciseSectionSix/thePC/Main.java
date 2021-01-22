package exerciseSectionSix.thePC;

public class Main {

    public static void main(String[] args) {

        Motherboard motherboard = new Motherboard("EL-01", "Dell", 5,8,"BIOS");
        Case theCase = new Case("Flyer-44", "Lincoln",400, new Dimensions(20,20,50));
        Monitor monitor = new Monitor("TrueView Revolution", "Samsung", 27,
                                                            new Resolution(1600,1200));
        PC pc = new PC(motherboard, monitor, theCase);

        pc.powerUp();


    }
}
