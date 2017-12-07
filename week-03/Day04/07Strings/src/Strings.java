public class Strings {
  public static void main(String[] args) {
    String stringSample = "i love the y letter: yyyyyyyyyyyyy but i dont like X";
  
    System.out.println(stringMinator(stringSample));
    
  }
  private static String stringMinator(String text) {
    if (text.length() == 0){
      return "";
    }
    else if (text.charAt(0)=='x'){
      return "y" + stringMinator(text.substring(1, text.length()));
    }
    else {
      return text.charAt(0) + stringMinator(text.substring(1, text.length()));
    }
  }
  
}
