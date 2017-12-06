import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {
  public static Scanner scanner = new Scanner(System.in);
  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.
    squareDrawer(graphics);
    System.out.println("Check your pop-up window.");
    
  }
  
  private static void squareDrawer(Graphics graphics) {
    
    System.out.println("Please enter the size of your square (px):");
    int size = scanner.nextInt();
    
    /*System.out.println("Please enter your favorite color:");
    String colorString = scanner.nextLine();
    Color color;
      try {
        Field field = Color.class.getField("yellow");
        color = (Color)field.get(null);
      } catch (Exception e) {
        color = null;
        System.out.println("nemmegy");
      }*/
  
    for (int i = HEIGHT/size; i >= 0; i--) {
      graphics.setColor(new Color(randomInt(255,0), randomInt(255, 0), randomInt(255,0)));
      graphics.fillRect(((WIDTH-(size+size*i))/2), (((HEIGHT-31)-(size+size*i))/2), size+size*i, size+size*i);
    
    }
    
   /* graphics.fillRect(((WIDTH-(size+50))/2), (((HEIGHT-31)-(size+50))/2), size+50, size+50);
    graphics.setColor(new Color(randomInt(255,0), randomInt(255,0), randomInt(255,0)));
    graphics.fillRect(((WIDTH-size)/2), (((HEIGHT-31)-size)/2), size, size);*/
    
    
    
    
    /*for (int i = 0; i < 7; i++) {
      graphics.setColor(new Color(randomInt(255,0), randomInt(255,0), randomInt(255,0)));
      graphics.fillRect(((WIDTH/2) - (size/2)), (((HEIGHT-31)/2) - (size/2)), size, size);
      graphics.setColor(new Color(randomInt(255,0), randomInt(255, 0), randomInt(255,0)));
      graphics.fillRect((WIDTH/2)-(size/2), ((HEIGHT-31)/2 - (size/2)), size+50*i, size+50*i);
    }*/
  }
  
  private static int randomInt(int max, int min) {
    int number = (int) (Math.random() * (max - min + 1)) + min;
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
