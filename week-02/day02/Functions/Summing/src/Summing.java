import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Summing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        System.out.println(sum(number));

    }

    public static int sum(int number) {
        int help = 0;
        for (int i = 0; i <= number; i++) {
            help = help + i;
        }

        return help;
    }

}
