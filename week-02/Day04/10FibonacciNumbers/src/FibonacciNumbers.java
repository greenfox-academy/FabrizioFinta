import java.util.Scanner;

public class FibonacciNumbers {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    // The fibonacci sequence is a famous bit of mathematics, and it happens to
    // have a recursive definition. The first two values in the sequence are
    // 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the
    // previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21
    // and so on. Define a recursive fibonacci(n) method that returns the nth
    // fibonacci number, with n=0 representing the start of the sequence.
    boolean wantToCont = true;
    while (wantToCont) {
      System.out.println("Please enter a Fibonacci number's index:");
      int n = scanner.nextInt();
      System.out.println(fibonacciNumbers(n));
      System.out.println("Would you like to try it again? (true/false)");
      wantToCont = scanner.nextBoolean();
    }
  }
  
  private static int fibonacciNumbers(int n) {
    if(n == 0 || n == 1){
      return n;
    } else {
      return fibonacciNumbers(n-1) + fibonacciNumbers(n-2);
    }
  }
}
