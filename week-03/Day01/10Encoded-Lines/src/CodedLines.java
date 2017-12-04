import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CodedLines {
  
  public static Path codedText = Paths.get("codedText.txt");
  
  public static void main(String[] args) {
    
    encoder(codedText);
    
  }
  
  private static void encoder(Path codedText) {
  
    for (int i = 65; i < 122; i++){
      Character encodedChar = (char)i;
      Character decodedChar = (char)(i+1);
      Map<encodedChar, decodedChar> keyMap = new Map<encodedChar, decodedChar>();
      
    }
    
  }
}
