import com.sun.org.apache.xalan.internal.xsltc.compiler.util.VoidType;
import sun.reflect.generics.tree.VoidDescriptor;

public class Reverse {
    public static void main(String[] args) {
        String text = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        String[] letters = new String[text.length()];
        for (Integer i = 0; i < letters.length; i++) {
            Character a = text.charAt(i);
            letters[i] = a.toString();
        }
        for (int a = 0; a < letters.length; a++) {
            System.out.print(letters[letters.length-1-a]);
        }





    }

   /* public static String reversedText(String text) {
        String[] letters = new String[text.length()];
        for (Integer i = 0; i < letters.length; i++) {
            Character a = text.charAt(i);
            letters[i] = a.toString();
        }
        for (int a = 0; a < letters.length; a++) {
            System.out.print(letters[letters.length-1-a]);
        }
    } */
}
