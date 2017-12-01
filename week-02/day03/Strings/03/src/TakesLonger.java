public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        String extra = "always takes longer than ";
        int num = quote.indexOf("you");
        System.out.println(quote.substring(0,num) + extra + quote.substring(num));
    }
}
