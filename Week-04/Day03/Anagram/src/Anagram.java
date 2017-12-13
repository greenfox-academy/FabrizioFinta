import java.util.Arrays;
import java.util.Collections;

public class Anagram {
  
  public boolean isAnagram(String input1, String input2) {
    try {
      char[] inputArray1 = input1.toCharArray();
      Arrays.sort(inputArray1);
      char[] inputArray2 = input2.toCharArray();
      Arrays.sort(inputArray2);
      return Arrays.equals(inputArray1, inputArray2);
    } catch (NullPointerException e) {
      System.err.println("You are dumb.");
      System.err.println("Null as input could not defined.");
      return false;
    }
  }
  
  public boolean isPolindrom(String input1, String input2) {
    StringBuilder sb = new StringBuilder(input1);
    return (sb.reverse().toString().equalsIgnoreCase(input2));
  }
}
