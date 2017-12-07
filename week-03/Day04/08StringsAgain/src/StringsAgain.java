public class StringsAgain {
  public static void main(String[] args) {
    String stringSample = "Its xa xbeatiful xday xfor xthe xrecursive xstuffs xn xshit";
    System.out.println(stringMinator1(stringSample));
  }
  
  private static String stringMinator1(String stringSample) {
  if (stringSample.length()==0){
    if (stringSample.charAt(0)== 'x'){
      return stringSample + "";
    }
    else {
      return stringSample + stringSample.charAt(0);
    }
  }
  if (stringSample.charAt(0) == 'x'){
    stringMinator1(stringSample.substring(0, stringSample.length()));
    return "" + stringSample;
  }
  else {
    stringMinator1(stringSample.substring(0,stringSample.length()));
    return stringSample.charAt(0) + stringSample ;
  }
  }
}
