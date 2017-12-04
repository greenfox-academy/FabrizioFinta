import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReverseOrder {
  public static Path reversedText = Paths.get("original.txt");
  public static void main(String[] args) {
    textReverser(reversedText);
  }
  
  private static void textReverser(Path reversedText) {
    try{
      
      ArrayList<String> reversedTextArray = new ArrayList<String>(Files.readAllLines(reversedText));
      ArrayList<String> textReverserArray = new ArrayList<String>();
      
      for(String lines : reversedTextArray);
      for (int index = 0; index < reversedTextArray.size(); index++) {
        textReverserArray.add(reversedTextArray.get(reversedTextArray.size()-1 - index));
      }

      Files.write(reversedText, textReverserArray);
      
    } catch (IOException e) {
      System.out.println("Something went wrong. Check the source file.");
    }
  }
}
