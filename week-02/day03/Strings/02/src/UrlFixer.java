public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = replaceEverything(url);
        System.out.println(url);
    }

    private static String replaceEverything(String url) {
        String url1 = url.replace("ots", "odd");
        String url2 = url1.replace("https//","https://");
        return url2;
    }
}
