package exerciseSectionSix.burger;

public class Main {
    public static void main(String[] args) {
        Hamburger ham = new Hamburger("superHam", 5.0, new Roll("white"),new Meat("chicken"));

        ham.makeAddition(new Pickle("pickle", 0.3,"regular"));

        VegetarianBurger vegan = new VegetarianBurger("vegan",3.0,new Roll("regular"),"vegName");

        vegan.makeAddition(new Mustard("mustard",1.0, "type"));
        vegan.makeAddition(new Mustard("mustard",1.0, "type"));
        vegan.makeAddition(new Mustard("mustard",1.0, "type"));

        DeluxeHamburger db = new DeluxeHamburger("deluxe", 7.5,new Roll("regular"),new Meat("beef"),
                new Drink("drink",2.0,"type"),new Crisps("chips",1.50,"wr"));

        db.makeAddition(new Tomato("tom",0.2,"red"));
        db.makeAddition(new Crisps("tom",0.2,"red"));
    }
}
