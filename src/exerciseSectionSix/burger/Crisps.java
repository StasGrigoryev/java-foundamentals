package exerciseSectionSix.burger;

public class Crisps extends Addition{
    private String type;

    public Crisps(String name, double prise, String type) {
        super(name, prise);
        this.type = type;
    }

    @Override
    public String getName() {
        return "crisps";
    }
}
