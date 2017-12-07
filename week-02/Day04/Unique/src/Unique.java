import java.util.ArrayList;
import java.util.Arrays;

public class Unique {
  public static void main(String[] args) {
    /*Create a function that takes a list of numbers as a parameter
    * Returns a list of numbers where every number in the list occurs only once
    *
    * Example
    * input: [1, 11, 34, 11, 52, 61, 1, 34]
    * output: [1, 11, 34, 52, 61] */
    
    ArrayList<Integer> firstList = new ArrayList<>(Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34));
    System.out.println("Input" + firstList);
    System.out.println("Output" + listAntiDuplicator(firstList));
    
    
  }
  
  private static ArrayList<Integer> listAntiDuplicator(ArrayList input) {
    for (int index = 0; index < input.size(); index++) {
      for (int sortIndex = index+1; sortIndex < input.size(); sortIndex++) {
        if (input.get(index) == input.get(sortIndex)){
          input.remove(sortIndex);
        }
      }
    }
    return input;
  }
}
