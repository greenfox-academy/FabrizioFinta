public class ConditionalVariableMutation {

    public static void main(String[] args) {
        String end = "====";

        int b = 13;
        String out2 = "";

        if ((10 < b) && (b < 20)) {
            out2 = "Sweet";
        }
        else if (10 > b) {
            out2 = "More";
        }
        else {
            out2 = "Less";
        }


        System.out.println(out2);

        System.out.println(end);

        int c = 123;
        int credits = 100;
        boolean isBonus = false;

        if ((credits >= 50) && (isBonus == false)) {
           c -= 2;
        }
        else if ((credits < 50) && (isBonus == false)) {
            c --;
        }
        else {
            c = c;
        }

        System.out.println(c);

        System.out.println(end);


        int d = 8;
        int time = 120;
        String out3 = "";

        if ((d % 4 == 0) && (time <= 200)) {
            out3 = "check";
        }
        else if (time > 200) {
            out3 = "Time out";
        }
        else {
            out3 = "Run Forest, RUN!";
        }

        System.out.println(out3);
        System.out.println(end);
    }


}
