public class StraingsAgainAgain {
  public static void main(String[] args) {
    String sample = "I like stars between the words.";
    stringer(sample);
  }
  
  private static String stringer(String sample) {
    if (sample.length() == 0){
      return sample + sample.charAt(0);
    }
    else if (sample.charAt(0)== ' '){
      return " " + stringer(sample.substring(0,sample.length()));
    }
    else {
      return sample.charAt(0) + stringer(sample.substring(0,sample.length()));
    }
  }
}
