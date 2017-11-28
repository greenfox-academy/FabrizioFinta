public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;

        System.out.println(a);

        int b = 100;
        b -= 7;

        System.out.println(b);

        int c = 44;
        c *= 2;

        System.out.println(c);

        int d = 125;
        d /= 5;

        System.out.println(d);

        int e = 8;
        e = (int) Math.pow(e, 3);

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;

        boolean biggerThan;
        if (f1 > f2) biggerThan = true;
        else biggerThan = false;

        System.out.println(biggerThan);

        int g1 = 350;
        int g2 = 200;

        boolean biggerThan2;
        if (Math.pow(g2, 2) > g1) biggerThan2 = true;
        else biggerThan2 = false;

        System.out.println(biggerThan2);

        int h = 135798745;
        // boolean division;
        //if
        int sum = 0;
        while (h > 0) {
                sum = sum + h % 10;
                h = h / 10;
        }


        int i1 = 10;
        int i2 = 3;

        boolean fuckThisThan;
        if (i1 > Math.pow(i2, 2)) fuckThisThan = true;
        else fuckThisThan = false;

        boolean fuckThisThan1;
        if (Math.pow(i2, 3) > i1) fuckThisThan1 = true;
        else fuckThisThan1 = false;
        boolean andgate = fuckThisThan && fuckThisThan1;

        System.out.println("i2^3 > i1 > i2^2 This statement is: " + andgate);
    }
}
