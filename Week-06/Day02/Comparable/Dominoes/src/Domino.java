import java.util.Arrays;

public class Domino implements Comparable <Object>{
  private final int[] values;
  
  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }
  
  public int[] getValues() {
    return values;
  }
  
  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }
  
  @Override
  public int compareTo(Object other) {
    if (other instanceof Domino) {
      Domino otherDomino = (Domino) other;
      if (this.values.equals(otherDomino.getValues()[0])) {
        return 0;
      } else if (this.values[0] > otherDomino.getValues()[0]) {
        return 1;
      } else if (this.values[0] < otherDomino.getValues()[0]){
        return -1;
      }
    }
    return 0;
  }
}