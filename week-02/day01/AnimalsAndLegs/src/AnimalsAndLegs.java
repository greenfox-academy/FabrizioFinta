import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of the chickens");
        int chickenlegs = scanner.nextInt();
        System.out.println("Enter the number of the pigs");
        int pigleg = scanner.nextInt();

        System.out.println("There are " + (pigleg * 4 + chickenlegs *2) + " legs on the farm. Yours is not included.");
    }
}
