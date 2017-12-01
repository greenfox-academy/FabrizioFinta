import java.util.*;
public class Matchmaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<String>();

        order.addAll(girls);
        System.out.println(order);
        for (int i = 0; i < boys.size(); i++) {
            order.add((i+1), boys.get(i));
        }
        System.out.println(order);
    }
}
