import com.sun.java.browser.plugin2.DOM;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    System.out.println(dominoes);
    System.out.println(organizeDominoes(dominoes));
  }
  
  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
  
  public static List<Domino> organizeDominoes(List<Domino> dominoes) {
    List<Domino> temp = new ArrayList<>();
    List<Domino> copyDominoes = new ArrayList<>(dominoes);
    int ind = 0;
    temp.add(dominoes.get(0));
    for (int index = 0; index < dominoes.size()-1; index++) {
      int index2 = 0;
      while (dominoes.get(index).getValues()[1] != dominoes.get(index2).getValues()[2]) {
        index2 ++;
      }
      temp.add(dominoes.get(index2+1));
    }
    return temp;
  }
}
