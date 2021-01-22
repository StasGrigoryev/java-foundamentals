package training.googleInterview;

public class FindNumbersForSum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4};
        int sum = 8;
        int low = 0;
        int high = arr.length-1;
        while (true) {
            int number = arr[low] + arr[high];
            if (number == sum) {
                System.out.println("The numbers are " + arr[low] + " and " + arr[high]);
                break;
            } else if (high < low) {
                System.out.println("element not found");
                break;
            } else {
                if (number > sum){
                    high--;
                } else {
                    low++;
                }
            }
        }
    }
}
