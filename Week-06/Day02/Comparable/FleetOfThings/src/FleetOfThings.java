import java.util.Collections;

public class FleetOfThings {
  
  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Thing milk = new Thing("Get milk");
    
    Thing obstacle = new Thing("Remove the obstacles");
    
    Thing standUp = new Thing("Stand up");
    standUp.complete();
    
    Thing eat1 = new Thing("l");
  
    Thing eat2 = new Thing("w");
  
    Thing eat3 = new Thing("q");
  
    Thing eat4 = new Thing("c");
  
    Thing eat5 = new Thing("a");
    
    eat2.complete();
    eat5.complete();
    
    fleet.add(milk);
    fleet.add(obstacle);
    fleet.add(standUp);
    fleet.add(eat1);
    fleet.add(eat2);
    fleet.add(eat3);
    fleet.add(eat4);
    fleet.add(eat5);

    fleet.sort();
    System.out.println(fleet);
  }
}