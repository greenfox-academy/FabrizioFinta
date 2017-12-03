import java.util.*;

public class CandyShop {

    public static void main(String... args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        arrayList.set(arrayList.indexOf(2), "Croissant");
        arrayList.set(arrayList.indexOf(false), true);

        System.out.println(arrayList);

    }
}
