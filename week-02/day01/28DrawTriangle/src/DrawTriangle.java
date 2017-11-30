import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole positive number");
        int number = scanner.nextInt();
        //int[] indexArray = new int[number-1];

        for (int i = 0; i < /*indexArray.lenght*/ number; i++) {
            //while (indexArray[i] == (i*1))
            for (int a = 0; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
