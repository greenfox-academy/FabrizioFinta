import java.util.Arrays;

public class Dice {
  //    You have a Dice class which has 6 dice
//    You can roll all of them with roll()
//    Check the current rolled numbers with getCurrent()
//    You can reroll with reroll()
//    Your task is to get where all dice is a 6
  int[] dices = new int[6];
  
  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }
  
  public int[] getCurrent() {
    return dices;
  }
  
  public int getCurrent(int i) {
    return dices[i];
  }
  
  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }
  
  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }
  
  public static void main(String[] args) {
    Dice myDice = new Dice();
    myDice.roll();
    System.out.println("My previous dice: " + Arrays.toString(myDice.getCurrent()));
    System.out.println("After my diceBot: ");
    diceBot(myDice);
  }
  
  private static void diceBot (Dice myDice) {
    int[] sixDices = {6, 6, 6, 6, 6, 6};
    int numberOfTries = 0;
    while (!(Arrays.equals(sixDices, myDice.getCurrent()))){
      myDice.reroll();
      numberOfTries++;
    }
    System.out.println("Current dice: " + Arrays.toString(myDice.getCurrent()) + " I tried it " + numberOfTries + " times");
  }
}