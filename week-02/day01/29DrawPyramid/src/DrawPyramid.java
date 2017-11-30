import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole positive number");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i+=2) {
            for (int b = 0; b < (int) number/2-i; b++) {
                System.out.print(" ");
            }
            for (int a = 0; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
