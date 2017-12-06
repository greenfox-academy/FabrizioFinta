import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquarePositioning {
  
  public static Scanner scanner = new Scanner(System.in);
  
  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    for (int i = 0; i < 3; i++) {
      squareDrawingFunction(graphics);
    }
    System.out.println("Now check the pop-up window.");
    
    
  }
  
  private static void squareDrawingFunction(Graphics graphics) {
    System.out.println("Please enter the X coordinate");
    int x = scanner.nextInt();
    System.out.println("Please enter the Y coordinate");
    int y = scanner.nextInt();
    
    graphics.setColor(new Color(randomInt(255,0), randomInt(255,0), randomInt(255,0)));
    graphics.fillRect(x,y,50,50);
  }
  
  private static int randomInt(int max, int min) {
    int number = (int)(Math.random()* (max-min+1)) + min;
    return number;
  }
  
  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;
  
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
