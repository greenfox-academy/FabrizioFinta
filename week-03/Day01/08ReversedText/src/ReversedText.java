import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReversedText {
  public static Path cryptedFile = Paths.get("crypted.txt");
  public static Path decryptedfile = Paths.get("decryptedFile.txt");
  public static void main(String[] args) {
    decrypter(cryptedFile);
    System.out.println("Process done. Check the file.");
  }
  
  private static void decrypter(Path cryptedFile) {
    
    try {
      ArrayList<String> decryptedList = new ArrayList<String>(Files.readAllLines(cryptedFile));
      for (String lines : decryptedList);
      for (int index = 0; index < decryptedList.size(); index++) {
        StringBuilder sb = new StringBuilder();
        decryptedList.set(index, sb.append(decryptedList.get(index)).reverse().toString());
      }
      Files.write(decryptedfile, decryptedList);
      
    } catch (IOException e){
      System.out.println("Something went wrong with the crypted file.");
    }
  
  }
}
