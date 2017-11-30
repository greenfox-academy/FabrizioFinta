import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type an Integer.");
        int num = scanner.nextInt();
        System.out.println(factorio(num));



    }

    private static int factorio(int num) {
        int help = 1;
        for (int i = 1; i <= num; i++) {
            help = i * help;
        }
        return help;
    }
}
