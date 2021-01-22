package exerciseSectionSix.cylinder;

public class CylinderTest {

    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(5,10);
        System.out.println(String.format("%.3f", cylinder.getVolume()));
    }
}
