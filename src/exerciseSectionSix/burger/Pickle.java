package exerciseSectionSix.burger;

public class Pickle extends Addition{
    private String type;

    public Pickle(String name, double prise, String type) {
        super(name, prise);
        this.type = type;
    }

    @Override
    public String getName() {
        return "pickle";
    }
}
