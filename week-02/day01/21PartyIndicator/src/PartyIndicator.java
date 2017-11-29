import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of the ladies:");
        int lady = scanner.nextInt();
        System.out.println("Please enter the number of the gentlemans:");
        int gent = scanner.nextInt();

        if ((lady == gent) && (lady+gent > 20)) {
            System.out.println("The party is excellent");
        }
        else if ((lady == gent) || (lady+gent > 20)) {
            System.out.println("Quite cool party!");
        }
        else if ((lady+gent < 20 && lady>0)) {
            System.out.println("Average party..");
        }
        else{
            System.out.println("Sausage party!");
        }
    }
}
