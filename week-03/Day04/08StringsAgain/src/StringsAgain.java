public class StringsAgain {
  public static void main(String[] args) {
    String stringSample = "Its xa xbeatiful xday xfor xthe xrecursive xstuffs xn xshit";
    System.out.println(stringMinator1(stringSample));
  }
  
  private static String stringMinator1(String a) {
    Character b = null;
    if (a.length() == 0 && a.charAt(0) == 'x') {
        return "";
      }
    else if (a.length() == 0){
      return "" + a.charAt(0);
    }
    else if (a.charAt(0) == 'x') {
        return "" + stringMinator1(a.substring(1, a.length()));
    }
     else {
        return a.charAt(0) + stringMinator1(a.substring(1, a.length()));
     }
  }
}
