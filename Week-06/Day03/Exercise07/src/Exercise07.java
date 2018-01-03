import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise07 {
  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA",
            "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    List<String> filteredCities = cities.stream()
            .filter(city -> city.startsWith("A") && city.endsWith("I"))
            .collect(Collectors.toList());
    System.out.println(filteredCities);
  }
}
