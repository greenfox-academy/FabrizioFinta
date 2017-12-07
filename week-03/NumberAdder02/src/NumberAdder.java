public class NumberAdder {
  public static void main(String[] args) {
    System.out.print(" = " + numberAdder(5));
  }
  
  private static int numberAdder(int n) {
    if(n==0){
      System.out.print(n);
      return 0;
    } else{
      System.out.print(n + " + ");
      return numberAdder(n-1)+n;
    }
  }
}
