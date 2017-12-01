import java.util.Arrays;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press a key to start");
        String useless = scanner.nextLine();



        //Exercise: arrange the numbers to the reverse order
        int[] aj = {3, 4, 5, 6, 7};
        System.out.println("Array at the beggining: " + Arrays.toString(aj));
        //Made an temporaryn empty array
        int[] ajCopy = new int[aj.length];

        // Create a loop what goes trough all the indexes.

        for (int i = 0; i < aj.length; i++) {
            ajCopy[aj.length - i - 1] = aj[i]; //each step gives the temp arrays index
        } //than puts the original arrays last number

        System.arraycopy(ajCopy, 0, aj, 0, aj.length); // copy the temp array
        //and past it in the original one

        System.out.println("Same array at the end " + Arrays.toString(aj));
        //PRINT IT & SEE WHAT I JUST CREATED !4!4!!!4!!!!44



    }
}





