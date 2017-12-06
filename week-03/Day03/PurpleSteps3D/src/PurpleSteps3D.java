import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
  
  public static Scanner scanner = new Scanner(System.in);
  
  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]
    
    stepper(graphics);
    
  
  }
  private static void stepper(Graphics graphics) {
    System.out.println("Please enter the first steps size (px)");
    int size = scanner.nextInt();
    
    sizeOptimizer(size); //It is not 100% thing because of the remainders
    //TODO do it to work like 100% - do not show the cubes what are not the perfect size
    int cordSize = 0;
    for (int i = 0; i< WIDTH/size; i++) {
      
      if (i==0){
        graphics.fill3DRect(size*i, size*i, size+size*i, size+size*i, true);
        cordSize = cordSize + size;
      }
      else{
        graphics.fill3DRect(cordSize, cordSize, size+size*i, size+size*i, true);
        cordSize = cordSize + size*i + size;
      }
    }
  }
  
  private static void sizeOptimizer(int size) {
    if (WIDTH > REALHEIGHT && !(WIDTH % size == 0 && REALHEIGHT % size == 0)){
      while ((WIDTH) % size == 0) {
        WIDTH--;
      }
    }
    else if (WIDTH < REALHEIGHT && !(WIDTH % size == 0 && REALHEIGHT % size == 0)) {
      while ((WIDTH) % size == 0) {
        WIDTH++;
      }
    }
    else if (WIDTH < REALHEIGHT && (WIDTH % size == 0 && !(REALHEIGHT % size == 0))){
      while ((REALHEIGHT) % size == 0) {
        REALHEIGHT--;
      }
    }
    else if (WIDTH > REALHEIGHT && (!(WIDTH % size == 0) && REALHEIGHT % size == 0)) {
      while ((REALHEIGHT) % size == 0) {
        REALHEIGHT++;
      }
    }
    else if (WIDTH == REALHEIGHT && !(WIDTH % size == 0)) {
      while ((WIDTH) % size == 0) {
        WIDTH++;
      }
    }
    
    /*while ((REALHEIGHT - 31) % size == 0) {
      REALHEIGHT--;
    }*/
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
