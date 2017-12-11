import java.awt.*;

public class PostIt {
  
  private Color backgroundColor;
  private String text;
  private Color textColor;
  
  public PostIt(String text) {
    this.text = text;
  }
  
  public void setBackgroundColor(Color backgroundColor){
    this.backgroundColor = backgroundColor;
  }
  
  public void setTextColor(Color textColor) {
    this.textColor = textColor;
  }
  
  @Override
  public String toString() {
    System.out.println("Just Imagine");
    return text + "'s color: " + textColor + " and its background is: " + backgroundColor;
  }
}
