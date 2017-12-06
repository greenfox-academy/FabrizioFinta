import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredBoxes {
  public static Scanner scanner = new Scanner(System.in);
  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
  
    for (int i = 0; i < 3; i++) {
      squareDrawer(graphics);
    }
    
    
    
  }
  
  private static void squareDrawer(Graphics graphics) {
    System.out.println("Please enter your square's size in pixels:");
    int size = scanner.nextInt();
    
    graphics.setColor(new Color(randomInt(255,0), randomInt(255,0), randomInt(255,0)));
    graphics.drawRect(((HEIGHT-31)/2-(size/2)), ((WIDTH/2)-(size/2)), size, size);
  }
  
  private static int randomInt(int max, int min) {
    int number = (int)(Math.random()* (max-min+1)) + min;
    return number;
  }
  
  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343; //312
  
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
      
    }
  }
  
}