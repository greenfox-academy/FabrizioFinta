public class Sharpie {
  private String color;
  private float width;
  private float inkAmount;
  
  public Sharpie(String color, float width){
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }
  
  public void use(){
    this.inkAmount -= 10;
    System.out.println("Ink amount decreased by 10.");
  }
  
  public void status(){
    System.out.println("Sharpie's color  is: " + color);
    System.out.println("Sharpie's width is:" + width);
    System.out.println("Sharpie's current ink amount is:" + inkAmount);
  }
}
