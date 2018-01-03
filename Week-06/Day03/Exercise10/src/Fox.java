import java.awt.*;

public class Fox {
  
  private String name;
  private String type;
  private Color color;
  
  Fox(String name, String type, Color color){
    this.name = name;
    this.type = type;
    this.color = color;
  }
  
  public String getType() {
    return type;
  }
  
  public Color getColor() {
    return color;
  }
  
  @Override
  public String toString() {
    return "Fox name: " + this.name +  " Type: " + this.type + " Color: " + this.color;
    
  }
}
