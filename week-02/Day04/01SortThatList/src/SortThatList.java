import java.util.*;

public class SortThatList {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    /* Create a function that takes a list of numbers as parameter
     * Returns a list where the elements are sorted in ascending numerical order
     * Make a second boolean parameter, if it's true sort that list descending
     * 
     * Example
     * input [34, 12, 24, 9, 5]
     * output [5, 9, 12, 24, 34] */
    boolean cont = true;
    while (cont) {
      System.out.println("Would you like to sort the list as descending order? (true/false)");
      boolean isDescOrder = scanner.nextBoolean();
      System.out.println();
      ArrayList<Integer> unSortedList = new ArrayList<>(Arrays.asList(34, 12, 24, 9, 5));
      System.out.println("Input: " + unSortedList);
      System.out.println("Output " + listSorter(unSortedList, isDescOrder));
      System.out.println();
      System.out.println("Would You like to repeat? (true/false)");
      cont = scanner.nextBoolean();
    }
  }
  
  private static ArrayList listSorter(ArrayList<Integer> input, Boolean descending) {
    if (descending){
      Collections.sort(input, Collections.reverseOrder());
    }
    else{
      Collections.sort(input);
    }
    return input;
  }
}
