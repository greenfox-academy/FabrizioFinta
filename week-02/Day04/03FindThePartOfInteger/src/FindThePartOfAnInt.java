import java.util.ArrayList;
import java.util.Arrays;

public class FindThePartOfAnInt {
  public static void main(String[] args) {
    /*
    * Create a function that takes a number and a list of numbers as a parameter
    * Returns the indeces of the numbers in the list where the first number is part of
    * Returns an empty list if the number is not part any of the numbers in the list
    *
    * Example
    * Input: [1, 11, 34, 52, 61], 1
    * output: [0, 1, 4]
    */
  
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 11, 34, 52, 61));
    Integer num = 1;
  
    System.out.println(findInteger(num, numbers));
    
  }
  
  private static ArrayList findInteger(Integer num, ArrayList<Integer> numbers) {
    ArrayList<Integer> whereIsTheNum = new ArrayList<>();
    for (int index = 0; index < numbers.size(); index++) {
      if (!(numbers.get(index).toString().indexOf(num.toString()) == -1)){
        whereIsTheNum.add(index);
      }
      else {
        for (int indexString = 0; indexString < numbers.get(index).toString().length(); indexString++) {
          if (numbers.get(index).toString().charAt(indexString) == num.toString().charAt(0)) {
            whereIsTheNum.add(index);
            break;
          }
        }
      }
    }
    return whereIsTheNum;
  }
}
