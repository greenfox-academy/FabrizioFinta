import java.awt.*;

public class Main {
  
  public static void main(String[] args) {
    //Example PostIts
    
    PostIt idea1 = new PostIt("Idea1");
    idea1.setTextColor(Color.blue);
    idea1.setBackgroundColor(Color.orange);
    
    PostIt awesome = new PostIt("Awesome");
    awesome.setTextColor(Color.black);
    awesome.setBackgroundColor(Color.pink);
    
    PostIt superb = new PostIt("Superb!");
    superb.setBackgroundColor(Color.yellow);
    superb.setTextColor(Color.green);
  
    System.out.println(idea1);
    System.out.println(awesome);
    System.out.println(superb);
  }
  
}
