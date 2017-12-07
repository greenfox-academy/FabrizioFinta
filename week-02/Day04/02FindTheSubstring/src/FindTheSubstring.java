public class FindTheSubstring {
  public static void main(String[] args) {
    /* Create a function that takes two strings as a parameter
     * Returns the starting index where the second one is starting in the first one
     * Returns -1 if the second string is not in the first one
     *
     * Example
     * input: "this is what I'm searching in", "searching"
     * output: 17 */
    String wantToSort = "this is what I'm searching in";
    String sort = "searching";
    System.out.println(stringSorter(wantToSort, sort));
    
    
  }
  
  private static int stringSorter(String wantToSort, String sort) {
      int charPos = - 1;
      for (int index = 0; index < wantToSort.length(); index++) {
        for (int endIndex = index+1; endIndex < wantToSort.length(); endIndex++) {
          if (wantToSort.substring(index, endIndex).equals(sort)) {
            charPos = index;
          }
        }
      }
      return charPos;
  }
}
