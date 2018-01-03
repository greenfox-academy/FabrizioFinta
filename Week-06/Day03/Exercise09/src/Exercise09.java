import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise09 {
  public static void main(String[] args) {
    
    String myString = "jamaika a jamaikaiake";
    char[] myCharArray = myString.toCharArray();
    
    //myCharArray.toString();
    
    Stream<Character> characterStream =
            new String(myCharArray).chars()
                    .mapToObj(c ->((char) c));
    
    characterStream.collect(
            StringBuilder::new,
            StringBuilder::appendCodePoint,
            StringBuilder::append)
            .toString();
  }
}
