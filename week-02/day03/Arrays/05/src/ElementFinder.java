import java.util.*;

public class ElementFinder {
    public static void main(String... args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        if (arrayList.contains(7)) {
            System.out.println("Hooray!");
        } else {
            System.out.println("Nooo");
        }

        arrayList.add(7);

        System.out.println(isitin(arrayList));

        arrayList.set(arrayList.indexOf(7), 30);

        System.out.println(isitin(arrayList));

    }
    private static String isitin(ArrayList<Integer> arrayList) {
        String isitin = "";
        for (int i = 0; i < arrayList.size(); i++) {
            boolean truestat = arrayList.get(i) == 7;
            if (truestat) {
                isitin = "Hooray";
            } else {
                isitin = "Noooo";
            }
        }
        return isitin;
    }
}

