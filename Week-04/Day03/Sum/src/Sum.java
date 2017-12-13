import java.util.ArrayList;
import java.util.List;

public class Sum {
  
  public List<Integer> getAutoListOfInts() {
    return autoListOfInts;
  }
  
  public List<Integer> getCustomListOfInts() {
    return customListOfInts;
  }
  
  private List<Integer> autoListOfInts;
  private List<Integer> customListOfInts;
  
  Sum() {
    autoListOfInts = new ArrayList<>();
    customListOfInts = new ArrayList<>();
  }
  
  void autoFillTheList(Integer howManyNumbers) {
    try {
      for (int intElement = 1; intElement <= howManyNumbers; intElement++) {
      autoListOfInts.add(intElement);
      }
    } catch (NullPointerException e) {
      System.err.println("You're dumb.");
      System.err.println("Don't put 'null' during the fill because it is not interpretable.");
      
    }
  }
  
  void addCustomInts(Integer number) {
    customListOfInts.add(number);
  }
  
  void removeCustomInts(Integer number) {
    try {
      customListOfInts.remove(number);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  int sumTheElements() {
    try {
      int sum = 0;
      if (autoListOfInts.isEmpty()) {
        for (int element : customListOfInts) {
          sum += element;
        }
        return sum;
      } else if (customListOfInts.isEmpty()) {
        for (int element : autoListOfInts) {
          sum += element;
        }
        return sum;
      } else if (!(customListOfInts.isEmpty() && autoListOfInts.isEmpty())) {
        for (int element : customListOfInts) {
          sum += element;
        }
        for (int element : autoListOfInts) {
          sum += element;
        }
        return sum;
      } else {
        return 0;
      }
    } catch (NullPointerException e) {
      System.err.println("You're dumb.");
      System.err.println("Don't put 'null' during the fill because it is not interpretable.");
      return 0;
    }
  }
}
