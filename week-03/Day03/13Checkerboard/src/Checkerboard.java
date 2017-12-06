import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  
  public static Scanner scanner = new Scanner(System.in);
  
  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.
    
    checkerboarder(graphics);
  
  }
  
  private static void checkerboarder(Graphics graphics) {
    System.out.println("Please give a size for one square");
    int size = scanner.nextInt();
    
    sizeOptimizer(size);
  
    for (int i = 0; i < REALHEIGHT/size; i++) {
      for (int j = 0; j < WIDTH/size; j+=2) {
        if (i%2 == 0){
          graphics.fillRect(j*size, i*size, size, size);
        }
        else {
          graphics.fillRect(j*size+size, i*size, size, size);
        }
      }
    }
    
  }
  
  //    Don't touch the code below
  static int WIDTH = 320;
  static int REALHEIGHT = 343;
  
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, REALHEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
      
    }
  }
  
  private static void sizeOptimizer(int size) {
    if (WIDTH > REALHEIGHT && ! (WIDTH % size == 0 && REALHEIGHT % size == 0)) {
      while ((WIDTH) % size == 0) {
        WIDTH--;
      }
    } else if (WIDTH < REALHEIGHT && ! (WIDTH % size == 0 && REALHEIGHT % size == 0)) {
      while ((WIDTH) % size == 0) {
        WIDTH++;
      }
    } else if (WIDTH < REALHEIGHT && (WIDTH % size == 0 && ! (REALHEIGHT % size == 0))) {
      while ((REALHEIGHT) % size == 0) {
        REALHEIGHT--;
      }
    } else if (WIDTH > REALHEIGHT && (! (WIDTH % size == 0) && REALHEIGHT % size == 0)) {
      while ((REALHEIGHT) % size == 0) {
        REALHEIGHT++;
      }
    } else if (WIDTH == REALHEIGHT && ! (WIDTH % size == 0)) {
      while ((WIDTH) % size == 0) {
        WIDTH++;
      }
    }
  }
}
