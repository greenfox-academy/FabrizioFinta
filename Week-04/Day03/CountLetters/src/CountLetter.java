import java.util.*;

public class CountLetter {
  
  public HashMap letterCounter(String text) {
    HashMap dictionary = new HashMap();
    List<Character> charOfText = new ArrayList<>();
    for (int i = 0; i < text.length(); i++) {
      charOfText.add(text.charAt(i));
    }
    Collections.sort(charOfText);
    int LetterCount = 0;

    for (int i = 0; i < charOfText.size()-1; i++) {
      if (charOfText.get(i) == charOfText.lastIndexOf(charOfText)) {
        LetterCount++;
        dictionary.put(charOfText.get(i), LetterCount);
      } else if (!(charOfText.get(i+1) == charOfText.lastIndexOf(charOfText))){
        dictionary.put(charOfText.get(charOfText.lastIndexOf(charOfText)), 1);
      } else if (charOfText.get(i) == charOfText.get(i+1)){
        LetterCount++;
      } else if (charOfText.get(i) != charOfText.get(i+1)){
        LetterCount++;
        dictionary.put(charOfText.get(i),LetterCount);
        LetterCount = 0;
      }
    }
    return dictionary;
  }
  
  public static void main(String[] args) {
  
  }
  
}
