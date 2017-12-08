public class BunniesAgain {
  public static void main(String[] args) {
    System.out.println(ultimateBunnyEarCounter(20));
  }
  
  private static int ultimateBunnyEarCounter(int b) {
    if (b == 0) {
      return 0;
    } else {
      if (b % 2 == 0) {
        return 2 + ultimateBunnyEarCounter(b - 1);
      }
      else {
        return 3 + ultimateBunnyEarCounter(b - 1);
      }
    }
  }
}
