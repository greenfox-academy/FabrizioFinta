public class Power {
  public static void main(String[] args) {
    System.out.println(powerNum(3,3));
  }
  
  private static int powerNum(int a, int b) {
    if (b==1){
      return a;
    }
    else{
      powerNum(a,b-1);
      return a*a;
    }
  }
}

