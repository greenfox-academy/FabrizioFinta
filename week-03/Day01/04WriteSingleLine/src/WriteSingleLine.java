import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    Path myFile = Paths.get("my-file.txt");
  writeMyName(myFile);
  }
  
  private static void writeMyName(Path myFile) {
    List<String> myNameAsList = new ArrayList<>(Arrays.asList("Fabrizio Finta"));
    try{
      Files.write(myFile, myNameAsList);
      System.out.println("File overwritten.");
    } catch (IOException e) {
      System.out.println("Uh-oh, could not write the file.");
    }
      }
}
