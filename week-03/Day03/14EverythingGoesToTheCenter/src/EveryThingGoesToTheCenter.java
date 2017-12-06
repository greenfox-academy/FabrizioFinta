import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EveryThingGoesToTheCenter {
  
  public static Scanner scanner = new Scanner(System.in);
  
  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.
    
    centerThing(graphics);
    
    
  }
  
  private static void centerThing(Graphics graphics) {
    System.out.println("Please type an X coordinate");
    int xCoord = scanner.nextInt();
    System.out.println("Please type an Y coordinate");
    int yCoord = scanner.nextInt();
    
    int yTemp= yCoord;
    int xCenter = WIDTH/2;
    int yCenter = REALHEIGHT/2;
    xDrawer(xCoord, yCoord, xCenter, yCenter, graphics);
    //yDrawer(xCoord, yCoord, xCenter, yCenter, graphics); //BUG
    
      /*for (int j = 0; yCoord+(20*j) <= REALHEIGHT; j++) {
      graphics.drawLine(xCoord, yTemp, xCenter, yCenter);
      yTemp = yTemp + 20;
      }*/
  }
  
  private static void yDrawer(int xCoord, int yCoord, int xCenter, int yCenter, Graphics graphics) {
    int yTemp = yCoord;
    for (int i = 0; yCoord+(20*i) <= REALHEIGHT; i++) {
      graphics.drawLine(xCoord, yTemp, xCenter, yCenter);
      yTemp = yTemp + 20;
    }
    yTemp = yCoord;
    for (int i = 0; REALHEIGHT-yCoord-20*i >= yCoord; i++) {
      graphics.drawLine(xCoord, yTemp, xCenter, yCenter);
      yTemp = yTemp - 20;
    }
  }
  
  private static void xDrawer(int xCoord, int yCoord, int xCenter, int yCenter, Graphics graphics ) {
    int xTemp = xCoord;
    for (int i = 0; xCoord+(20*i) <= WIDTH; i++) {
      graphics.drawLine(xTemp, yCoord, xCenter, yCenter);
      xTemp = xTemp + 20;
    }
    xTemp = xCoord;
    for (int i = 0; xCoord-20*i >= 0; i++) {
      graphics.drawLine(xTemp, yCoord, xCenter, yCenter);
      xTemp = xTemp - 20;
    }
  }
  
  
  
  //    Don't touch the code below
  static int WIDTH = 320;
  static int REALHEIGHT = 312;
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
