import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Doubled {
  public static Path originalText = Paths.get("mess.txt");
  public static void main(String[] args) {
    
    decriptor();
    
  }
  
  private static void decriptor() {
    try {
      String temp = null;
      ArrayList<String> messList = new ArrayList<>(Files.readAllLines(originalText));
      for (String lines : messList) ;
      for (int index = 0; index < messList.size(); index++) {
        temp = messList.get(index);
        String tempNew = "";
        for (int charAtIndex = 0; charAtIndex < temp.length()-1; charAtIndex++) {
          if (!(temp.charAt(charAtIndex) == temp.charAt(charAtIndex+1))) {
            tempNew = tempNew + temp.charAt(charAtIndex);
          }
        }
        messList.set(index, tempNew);
      }
  
      Files.write(originalText, messList);
    }
    catch (IOException e) {
      System.out.println("Something went wrong, check the original file.");
    }
  }
}
