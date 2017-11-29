import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a distance in km (eg.: 32,42):");
        double km = scanner.nextDouble();
        double mile = 0.6213;
        double dest = km*mile;
        System.out.println(km + " kilometers are " + dest + " miles.");


    }
}
