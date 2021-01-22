package challenges.problems;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        float floatValue = 2.1f;

        int weightInPounds = 7;
        double POUND_TO_KG = 0.45359237d;
        double weightInKgs = weightInPounds * POUND_TO_KG;
        System.out.println(weightInKgs);


    }

}
