public class Bunnies {
  public static void main(String[] args) {
    System.out.println(bunnyEarCounter(40));
  }
  
  private static int bunnyEarCounter(int b) {
    if (b==0){
      return 0;
    }
    else {
      bunnyEarCounter(b-1);
      return b+b;
    }
  }
}

