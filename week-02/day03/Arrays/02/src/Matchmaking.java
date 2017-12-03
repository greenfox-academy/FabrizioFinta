import java.util.*;
public class Matchmaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<String>();

        order.addAll(girls);
        for (int i = 1; i < boys.size(); i+=1) {
            order.add(i*2-1, boys.get(i));
        }
        System.out.println(order);
    }
}
