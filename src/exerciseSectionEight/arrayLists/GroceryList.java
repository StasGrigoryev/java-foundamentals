package exerciseSectionEight.arrayLists;
import java.util.*;

public class GroceryList {

    private ArrayList<String> groceryList;

    public String findItem (String item) {
        int position = groceryList.indexOf(item);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }

    public void printGroceryList () {
        System.out.println("you have " + groceryList.size() + " items in your Grocery List: :");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i+1 + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList (int index, String newItem) {
        String oldItem = groceryList.get(index);
        groceryList.set(index, newItem);
        System.out.println("The item " + oldItem + " has been replaced with " + groceryList.get(index));
    }

    public void removeItem (int index) {
        String item = groceryList.get(index);
        groceryList.remove(index);
    }
}
