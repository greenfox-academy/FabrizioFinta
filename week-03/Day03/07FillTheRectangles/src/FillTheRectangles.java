
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillTheRectangles {
  
  public static void mainDraw(Graphics graphics) {
    // draw four different size and color rectangles.
  
    for (int i = 0; i <= 3; i++) {
      randomrect(graphics);
    }
  }
  private static void randomrect(Graphics graphics) {
    int randomNumber = (int)(Math.random()*256)+0;
    int anOtherRandomNumber = (int)(Math.random()*256)+0;
    int thirdRandomNumber = (int)(Math.random()*256)+0;
    
    graphics.setColor(new Color(randomNumber, anOtherRandomNumber, thirdRandomNumber));
    graphics.drawRect(randomNumber, anOtherRandomNumber, anOtherRandomNumber, thirdRandomNumber);
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
