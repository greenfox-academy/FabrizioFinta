import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole positive number");
        int number = scanner.nextInt();

        for (int i = 0; i < (number-1); i+=2) {
            for (int b = 0; b <= number-i; b+=2) {
                System.out.print(" ");
            }
            for (int a = 0; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if (number % 2 == 0) {
            for (int ineg = 1; ineg < number;ineg += 2 ) {
                /*if (ineg==0) {
                    System.out.println("ok");
                }
                else */
                for (int bneg = 0; bneg <= ineg + 1; bneg += 2) {
                    System.out.print(" ");
                }
                for (int aneg = 0; aneg < number - ineg; aneg++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else {
            for (int ineg = 0; ineg < number;ineg += 2 ) {

                for (int bneg = 0; bneg <= ineg; bneg += 2) {
                    System.out.print(" ");
                }
                for (int aneg = 0; aneg < number - ineg; aneg++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            }
        }

    }

