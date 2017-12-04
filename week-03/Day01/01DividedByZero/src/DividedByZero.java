import java.util.Scanner;

public class DividedByZero {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    int dividend = 10;
    try {
      double result = dividend / takenNumber(scanner);
      System.out.println(result);
    } catch (ArithmeticException e) {
        System.out.println("fail");
    }
  }
  
  private static int takenNumber(Scanner scanner) {
    System.out.println("Please enter a number");
    int num = scanner.nextInt();
    return num;
  }
}
