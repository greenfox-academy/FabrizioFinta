import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number");
        double number1 = scanner.nextDouble();
        System.out.println("Please type an other number");
        double number2 = scanner.nextDouble();

        if (number1 > number2) {
            System.out.println(number1 + " is the bigger.");
        }
        else if (number1 == number2) {
            System.out.println("The two number is equal.");
        }
        else {
            System.out.println(number2 + " is the bigger.");
        }
    }
}
