import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  
  public static Scanner scanner = new Scanner(System.in);
  
  public static void mainDraw(Graphics graphics){
    
    //TODO make the thing go the original color
    graphics.setColor(Color.GREEN);
    stepper(graphics);
  
    System.out.println("Check the pop-up.");
  
  }
  
  private static void stepper(Graphics graphics) {
    System.out.println("Please enter the first steps size (px)");
    int size = scanner.nextInt();
    
    sizeOptimizer(size); //It is not 100% thing because of the remainders
    //TODO do it to work like 100% - do not show the cubes what are not the perfect size
    
    for (int i = 0; i< WIDTH/size; i++) {
      graphics.fill3DRect(size*i, size*i, size, size, true);
    }
  }
  
  private static void sizeOptimizer(int size) {
    while ((WIDTH) % size == 0) {
      WIDTH--;
    }
    while ((HEIGHT-31) % size == 0){
      HEIGHT--;
    }
  }
  
  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343; //magic number 31
  
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