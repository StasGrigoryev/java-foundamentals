package training.clothes;

public class ClothesTest {

    public static void main(String[] args) {

        Clothes clothes = new Clothes(44, "black", "cotton");
        TShirt tShirt = new TShirt(48, "green", "cotton", true, 20);

        clothes.getDirty();
    }
}
