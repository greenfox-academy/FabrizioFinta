import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Reproduce {
  public static void mainDraw(Graphics graphics) {
    int[] xPoints = {20, 400, 220};
    int[] yPoints = {20, 20, 380};
    int nPoints = 3;
    //graphics.drawPolygon(xPoints,yPoints,nPoints);
    
    mainTriangleBuilder(graphics, xPoints, yPoints, nPoints, 10);
  }
  
  private static void mainTriangleBuilder(Graphics graphics, int[] xPoints, int[] yPoints, int nPoints, int rounds) {
      graphics.drawPolygon(xPoints, yPoints, nPoints);
      secondTriangleBuilder(graphics, xPoints, yPoints, nPoints);
  }
  private static void secondTriangleBuilder(Graphics graphics, int[] xPoints, int[] yPoints, int nPoints) {
    xPoints[1] = xPoints[2] -20 / 2;
    xPoints[2] = xPoints[2] -20 / 4;
    xPoints[3] = xPoints[] -20 / 2;
    yPoints[1] = yPoints[1] / 2;
    yPoints[2] = yPoints[2] / 2;
    yPoints[3] = yPoints[3] / 2;
  }
  
  static int WIDTH = 600;
  static int HEIGHT = 631;
  
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
