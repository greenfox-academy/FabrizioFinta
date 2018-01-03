import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise01 {
  
  public static void main(String[] args) {
  
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, - 2, - 4, - 7, - 3, - 8, 12, 19, 6, 9, 10, 14));
    List<Integer> evenNumbers = numbers.stream()
            .filter(n -> Math.abs(n) % 2 == 0)
            .collect(Collectors.toList());
    System.out.println(evenNumbers);
  }
  
}
