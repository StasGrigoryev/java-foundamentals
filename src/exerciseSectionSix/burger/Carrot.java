package exerciseSectionSix.burger;

public class Carrot extends Addition{
    private String type;

    public Carrot(String name, double prise, String type) {
        super(name, prise);
        this.type = type;
    }

    @Override
    public String getName() {
        return "carrot";
    }
}
