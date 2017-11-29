import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String HW = "Hello, World!";
        System.out.println(HW);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name "!");
    }
}
