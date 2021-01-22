package exerciseSectionSix.burger;

public class Hamburger {
    private String name;
    private double price;
    private Roll roll;
    private Meat meat;
    private Mustard mustard;
    private Tomato tomato;
    private Pickle pickle;

    private double additionsPrice;
    private double totalPrice;

    public void makeAddition (Addition addition) {
        if (addition != null) {
            additionsPrice += addition.getPrise();
            totalPrice = price + additionsPrice;
            System.out.println("Hamburger.makeAddition(): " + addition.getName() + " was added. Total price is " + getTotalPrice());
        } else System.out.println("No addition was made. Total price is " + getTotalPrice());
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setMustard(Mustard mustard) {
        this.mustard = mustard;
    }

    public void setTomato(Tomato tomato) {
        this.tomato = tomato;
    }

    public void setPickle(Pickle pickle) {
        this.pickle = pickle;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setAdditionsPrice(double additionsPrice) {
        this.additionsPrice = additionsPrice;
    }

    public Hamburger(String name, double price, Roll roll, Meat meat) {
        this.name = name;
        this.price = price;
        this.roll = roll;
        this.meat = meat;
    }

    public Hamburger (String name, double price, Roll roll) {
        this.name = name;
        this.price = price;
        this.roll = roll;
    }
}
