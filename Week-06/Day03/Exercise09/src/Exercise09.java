import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise09 {
  public static void main(String[] args) {
    
    String myString = "jamaika a jamaikaiake";
    Character[] myCharArray = {'a', 'k', 'd'};
    char[] myOtherCharArray = myString.toCharArray();
    
    //myCharArray.toString();
    
    Arrays.stream(myCharArray)
            .map(c -> c.toString())
            .collect(Collectors.joining());
    
    Stream<Character> characterStream =
            new String(myOtherCharArray).chars()
                    .mapToObj(c ->((char) c));
    
    characterStream.collect(
            StringBuilder::new,
            StringBuilder::appendCodePoint,
            StringBuilder::append)
            .toString();
  }
}
