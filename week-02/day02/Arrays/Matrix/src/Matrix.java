import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int sizeA = scanner.nextInt();
        int[][] matrixArray = new int[sizeA][sizeA];
        for (int i = 0; i < sizeA; i++){
            for (int j = 0; j < sizeA; j++) {
                if (i == j) {
                matrixArray[i][j] = 1;
                }
                else {
                    matrixArray[i][j] = 0;
                }
            }

        }

        for (int i = 0; i <= matrixArray[i].length; i++) {
            System.out.println(Arrays.toString(matrixArray[i]));

        }


    }



}
