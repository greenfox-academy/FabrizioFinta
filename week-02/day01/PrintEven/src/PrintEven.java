public class PrintEven {
    public static void main(String[] args) {

        /*for (int i = 1; i < 500; i +=2) {
            System.out.println(i);*/

        for (int i = 0; i < 500; i++) {
            if (i % 2 == 1) {
                System.out.println("Even" + i);
            }

        }
    }
}
