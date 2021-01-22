package exerciseSectionSix.burger;

public class DeluxeHamburger extends Hamburger{
    private String deluxeName;
    private Drink drink;
    private Crisps crisps;
    private double additionsPrice;
    private double totalPrice;

    public DeluxeHamburger(String name, double prise, Roll roll, Meat meat, Drink drink, Crisps crisps) {
        super(name, prise, roll, meat);
        this.drink = drink;
        this.crisps = crisps;
    }

    @Override
    public void makeAddition(Addition addition) {
        if (addition.getClass().equals(drink.getClass()) || addition.getClass().equals(crisps.getClass())) {
            additionsPrice += addition.getPrise();
            totalPrice = getPrice() + additionsPrice;
            setTotalPrice(totalPrice);
            System.out.println("DB.makeAddition(): " + addition.getName() + " was added. Total price is " + getTotalPrice());
        } else System.out.println("You can add only drinks and crisps. Total price is " + getTotalPrice());
    }
}
