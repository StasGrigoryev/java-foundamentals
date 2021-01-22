package exerciseSectionSix.burger;

public class Mustard extends Addition{
    private String type;

    public Mustard(String name, double prise, String type) {
        super(name, prise);
        this.type = type;
    }

    @Override
    public String getName() {
        return "mustard";
    }
}
