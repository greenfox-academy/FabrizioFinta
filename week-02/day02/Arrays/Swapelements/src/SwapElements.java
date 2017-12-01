import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        String help = "asd";
        help = abc[0];
        abc[0]=abc[2];
        abc[2] = help;

        System.out.println(Arrays.toString(abc));
    }
}
