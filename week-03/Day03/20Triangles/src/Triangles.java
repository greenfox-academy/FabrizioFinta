import com.sun.corba.se.impl.orbutil.graph.Graph;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  
  public static int triangleStandard = 20*20;
  
  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/triangles/r5.png]
    
    horizontalLines(graphics);
    //crosslineLeftStart();
    //crosslineRightStart();
    
    //TODO draw the 3 triangles to the corners
    
  }
  
  private static void horizontalLines(Graphics graphics) {
    int xStart = 0;
    int yStart = triangleStandard;
    int xEnd = triangleStandard;
    int yEnd = triangleStandard;
    for (int i = 0; i < 19; i++) {
      graphics.drawLine(xStart, yStart, xEnd, yEnd);
      xStart = xStart + 10;
      yStart = yStart - 20;
      xEnd = xEnd - 10;
      yEnd = yEnd - 20;
    }
  }
  
  //    Don't touch the code below
  static int WIDTH = 40*21;
  static int HEIGHT = 20*30;
  static int REALHEIGHT = HEIGHT-31;
  
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
