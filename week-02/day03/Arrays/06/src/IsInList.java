import java.lang.reflect.Array;
import java.util.*;

public class IsInList {
    public static ArrayList<Integer> sortedList = new ArrayList<Integer>(Arrays.asList(4, 8, 7, 16));
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        System.out.println(list.containsAll(sortedList));

        System.out.println(areTheeseIn(list));




    }

    private static boolean areTheeseIn(ArrayList list) {
        Boolean areTheeseIn = null;
        ArrayList<Boolean> booleanArrayList = new ArrayList<>();
        for (int filtNumIndex = 0; filtNumIndex < sortedList.size(); filtNumIndex++) {
            sortedList.get(filtNumIndex);
            for (int listIndex = 0; listIndex < list.size(); listIndex++) {
                Boolean booleanArrayElement = null;
                booleanArrayElement = list.get(listIndex) == sortedList.get(filtNumIndex);
                booleanArrayList.add(booleanArrayElement);
            }
        }

        if (Collections.frequency(booleanArrayList, true) == sortedList.size()){
            areTheeseIn = true; //What should i do to calculate how many times i have the true value in my arraylist?
        }
        else {
            areTheeseIn = false;
        }

        return areTheeseIn;
        }
}
