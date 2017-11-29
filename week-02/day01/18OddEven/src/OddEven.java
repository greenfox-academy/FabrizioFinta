import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }

    }
}
