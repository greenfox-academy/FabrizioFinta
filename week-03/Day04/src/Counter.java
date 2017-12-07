public class Counter {
  public static void main(String[] args) {
    counter(5);
  }
  
  private static int counter(int n) {
      if(n==0){
      return 0;
    } else{
      counter(n-1);
        System.out.println(n);
      return n;
    }
  }
}
