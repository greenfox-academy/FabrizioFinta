public class SumDigit {
  public static void main(String[] args) {
    System.out.println(sumDigits(126));
    
  }
  
  private static int sumDigits(int i) {
    if (i%10==0){
      return i=0;
    }
    else{
      
      System.out.println(i + " and " + i%10);
      return i%10+sumDigits(i/10);
    }
  }
}
