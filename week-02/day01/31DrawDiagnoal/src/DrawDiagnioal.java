import java.util.Scanner;

public class DrawDiagnioal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (min.: 5):");
        int number = scanner.nextInt();

        if (number >= 5){
            for (int i = 0; i < number; i++) {
                for (int percent = 0; percent < number; percent++) {
                    System.out.print("%");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Number is too small!");
        }
    }
}
