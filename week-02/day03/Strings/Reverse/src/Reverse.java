import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        String text = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println(reversedText(text));
    }

    public static String reversedText(String text) {
        String rev = "";
        for (int i = 0; i < text.length(); i++) {
            rev = rev + text.charAt(text.length() - 1 - i);
        }
        return rev;
    }

}