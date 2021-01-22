package exerciseSectionSix.burger;

public class Tomato extends Addition{
    private String type;

    public Tomato(String name, double prise, String type) {
        super(name, prise);
        this.type = type;
    }

    @Override
    public String getName() {
        return "tomato";
    }
}
