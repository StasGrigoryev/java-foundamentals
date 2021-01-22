package exerciseSectionSix.burger;

public class Drink extends Addition{
    private String type;

    public Drink(String name, double prise, String type) {
        super(name, prise);
        this.type = type;
    }

    @Override
    public String getName() {
        return "drink";
    }
}
