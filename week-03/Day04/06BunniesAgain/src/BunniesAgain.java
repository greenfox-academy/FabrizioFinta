public class BunniesAgain {
  public static void main(String[] args) {
    ultimateBunnyEarCounter(20);
  }
  
  private static void ultimateBunnyEarCounter(int b) {
    if (b == 0) {
      b = 0;
    } else {
      if (b % 2 == 0) {
        ultimateBunnyEarCounter(b - 1);
        b = b + b;
      }
      if (b % 2 == 1) {
        ultimateBunnyEarCounter(b - 1);
        b = b + b + b;
      }
    }
  }
}
