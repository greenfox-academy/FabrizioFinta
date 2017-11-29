import java.util.Scanner;
public class Cuboid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String cm = " cm";
        System.out.println("Please enter your Cuboids lenght (in centimeters): ");
        double a = scanner.nextDouble();

        System.out.println("Please enter your Cuboids height (in centimeters): ");
        double b = scanner.nextDouble();

        System.out.println("Please enter your Cuboids depht (in centimeters): ");
        double c = scanner.nextDouble() ;
        // System.out.print(" cm");


        double v = a*b*c;
        double A = 2*(a*b+a*c+b*c);

        System.out.println("Your Cuboids Volume is: " + v + " cm^3");
        System.out.println("Your Cuboids Surface Area is: " + A + " cm^2");
    }

}
