import java.util.Arrays;
import java.util.Collections;

public class Anagram {
  
  public boolean isAnagram(String input1, String input2) {
    char[] inputArray1 = input1.toCharArray();
    Arrays.sort(inputArray1);
    char[] inputArray2 = input2.toCharArray();
    Arrays.sort(inputArray2);
    return inputArray1.equals(inputArray2);
  }
  
  public boolean isPolindrom(String input1, String input2) {
    StringBuilder sb = new StringBuilder(input1);
    return (sb.reverse().toString().equalsIgnoreCase(input2));
  }
  
  public static void main(String[] args) {
    Anagram anagram = new Anagram();
    System.out.println(anagram.isAnagram("megkéselterény", "termelékenység"));
  }
}
