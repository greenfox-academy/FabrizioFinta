import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {
  public static void main(String[] args) {
  
    ArrayList<Fox> foxList = new ArrayList<>();
    
    foxList.add(new Fox("FoxiMaxi", "Pallida", Color.GREEN));
    foxList.add(new Fox("Vuk", "Corsac", Color.RED));
    foxList.add(new Fox("Geronimo Stilton", "Liber", Color.YELLOW));
    foxList.add(new Fox("Róka koma", "Corsac", Color.GREEN));
    foxList.add(new Fox("Karakk", "Liber", Color.PINK));
    
    List<Fox> greenFoxList = foxList.stream()
            .filter(fox -> fox.getColor()==Color.GREEN)
            .collect(Collectors.toList());
    System.out.println(greenFoxList);
    
    List<Fox> greenPallidaFoxList = foxList.stream()
            .filter(fox -> fox.getColor()==Color.GREEN && fox.getType() == "Pallida")
            .collect(Collectors.toList());
    System.out.println(greenPallidaFoxList);
  }
}
