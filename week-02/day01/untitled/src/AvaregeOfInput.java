import java.util.ArrayList;
import java.util.Scanner;

public class AvaregeOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number and press enter:");
        ArrayList<Integer> number = new ArrayList<>();
        int nr1 = scanner.nextInt();
        number.add(nr1);
        int nr2 = scanner.nextInt();
        number.add(nr2);
        int nr3 = scanner.nextInt();
        number.add(nr3);
        int nr4 = scanner.nextInt();
        number.add(nr4);
        int nr5 = scanner.nextInt();
        number.add(nr5);

        int sum = 0;
        for(int i = 0; number.size() > i; i++) {
              sum += number.get(i);
        }
        System.out.println("The summary of your numbers is: " + sum);
        System.out.println("The avarege of your numbers is: " + sum / number.size());


    }
}
