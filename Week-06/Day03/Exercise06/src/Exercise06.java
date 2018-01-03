import java.util.Map;
import java.util.stream.Collectors;

public class Exercise06 {
  public static void main(String[] args) {
    String myString = "jamaika a jamaikaiake";
    Map<String, Long> charFreq = myString.chars()
            .mapToObj(c -> Character.toString((char) c))
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    System.out.println(charFreq);
  }
}
