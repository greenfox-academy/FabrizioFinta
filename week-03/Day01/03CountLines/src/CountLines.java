import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    Path myFile = Paths.get("thisIsAFile.txt");
    
    lineNumCounter(myFile);
  }
  
  private static void lineNumCounter(Path myFile) {
    try {
    List<String> lines = Files.readAllLines(myFile);
      System.out.println(lines.size());
    } catch (IOException e) {
        System.out.println("Ooopps");
    }
    
   
  }
}
