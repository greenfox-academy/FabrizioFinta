public class PrintEven {
    public static void main(String[] args) {

        for (int i = 1; i < 500; i +=2) {
            System.out.println(i);

        }
        /*miért nem működik így?

        for (int i = 0; i < 500; i++) {
            System.out.println(i % 2 = 1);*/

        }
    }
}
