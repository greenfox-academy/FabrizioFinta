import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter a second number:");
        int num2 = scanner.nextInt();

        if (num1 >= num2) {
            System.out.println("Second number should be bigger.");
        }
        else {
            for (int num = 0; num1 < num2; num1++) {
                System.out.println(num1);

            }
        }
    }
}
