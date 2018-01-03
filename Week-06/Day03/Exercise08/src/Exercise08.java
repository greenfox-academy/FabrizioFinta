import java.util.List;
import java.util.stream.Collectors;

public class Exercise08 {
  public static void main(String[] args) {
    String myString = "JamAika A JaMAIKAIake";
    
    List<String> upperCaseLetters = myString.chars()
            .filter(c -> Character.isUpperCase(c))
            .mapToObj(c -> Character.toString((char) c))
            .collect(Collectors.toList());
    
    System.out.println(upperCaseLetters);
  }
}
