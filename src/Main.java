public class Main {


    public static void main(String[] args) {

        Cat catOne = new Cat("Murzik");
        System.out.println("catOne's name: " + catOne.getName());
        methodOne(catOne,"Sterling");
        System.out.println("catOne's name: " + catOne.getName());
    }
    public static void methodOne (Cat cat, String name) {
        cat.setName(name);
    }
}

class Cat {
    private String name;

    public Cat(String name) {
         this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
