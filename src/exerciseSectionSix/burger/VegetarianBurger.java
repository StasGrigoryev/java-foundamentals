package exerciseSectionSix.burger;

public class VegetarianBurger extends Hamburger{
    private String vegetarianName;

    private double additionsPrice;
    private double totalPrice;
    private int additionCount = 0;

    public VegetarianBurger(String name, double price, Roll roll, String vegetarianName) {
        super(name, price, roll);
        this.vegetarianName = vegetarianName;
    }

    @Override
    public void makeAddition(Addition addition) {
        if (addition != null && additionCount != 2) {
            additionsPrice += addition.getPrise();
            totalPrice = getPrice() + additionsPrice;
            setTotalPrice(totalPrice);
            additionCount++;
            System.out.println("VB.makeAddition(): " + addition.getName() + " was added. Total price is " + getTotalPrice());
        } else System.out.println("You reached the limit in additionals. Total price is " + getTotalPrice());
    }
}
