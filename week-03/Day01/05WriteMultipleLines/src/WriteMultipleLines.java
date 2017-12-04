import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static final String myFileIsLocation = "src/hereItIs";
  public static final String word = "lorem ipsum";
  public static final int numberOfLines = 5;
  public static void main(String[] args) {
    file();
  }
  
  private static void file() {
    Path file = Paths.get(myFileIsLocation);
    List<String> lines = new ArrayList<>();
    for (int index = 0; index < numberOfLines; index++) {
      lines.add(index, word);
    }
    System.out.println("Method was succesfull.");
    try{
      Files.write(file, lines);
    } catch (IOException e){
      System.out.println("Something went wrong. Check the file.");
    }
    
  }
}
