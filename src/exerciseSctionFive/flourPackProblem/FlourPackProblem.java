package exerciseSctionFive.flourPackProblem;

public class FlourPackProblem {

    public static void main(String[] args) {

        System.out.println(canPack(1,0,5));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {

        final int BIG_BAG_WEIGHT = 5;
        final int SMALL_BAG_WEIGHT = 1;

        int bigBagsWeight = BIG_BAG_WEIGHT * bigCount;
        int smallBagsWeight = SMALL_BAG_WEIGHT * smallCount;
        int sumWeight = bigBagsWeight + smallBagsWeight;

        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {

            if (sumWeight >= goal) {
                if (bigCount == goal) {
                    return false;
                } else if (goal % BIG_BAG_WEIGHT <= smallCount) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

}
