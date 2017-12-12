public class Trees extends Plants{
  
  public void status(){
    System.out.println((getNeedWater()) ? "The " + getColor() + " color tree needs water" : "The " + getColor() + " color tree doesnt need water.");
    
    }
  }
