import java.util.Scanner;

public class GuessingGame {
  
  public static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    boolean gameRun = true;
    while(gameRun) {
      System.out.println("Please enter the minimum range of the guessing game: ");
      int minRange = scanner.nextInt();
      System.out.println("Please enter the maximum range of the guessing game: ");
      int maxRange = scanner.nextInt();
      System.out.println();
      System.out.println("Thank you!");
      System.out.println();
      
      int lives = rangesToLives(maxRange, minRange);
      lives = guessingCheat(lives);
      
      int randomNumber = (int)(Math.random()*maxRange)+minRange;
      System.out.println(randomNumber);
      
      boolean isThereAnyLivesLeft = true;
      while (isThereAnyLivesLeft) {
        isThereAnyLivesLeft = lives > 0;
        System.out.println("You have " + lives + " lives left.");
        System.out.println("Which number i thought in the range of " + minRange + " and " + maxRange + "?");
        int guess = scanner.nextInt();
        if (! tipChecker(guess, randomNumber)){
          lives = lives-1;
        } else {
          System.out.println("Yaaayy you win!");
          isThereAnyLivesLeft = false;
        }
      }
      if (lives == 0) {
        System.out.println("The number was: " + randomNumber + ". Better luck next time! :)");
      }
      
      System.out.println();
      System.out.println("Want to play again? (Yes/No)");
      String wantToPlay = scanner.nextLine();
      if (wantToPlay.equalsIgnoreCase("yes") || wantToPlay.equalsIgnoreCase("no")) {
        gameRun = playAgain(wantToPlay);
      } else{
        System.out.println("You seem to be tyred for this. Have a rest. See you later!");
      }
    }
  }
  
  private static boolean playAgain(String wantToPlay) {
    return wantToPlay.equalsIgnoreCase("Yes");
  }
  
  private static boolean tipChecker(int guess, int number) {
    boolean guessedTheNumber = false;
    if (guess >= number+10){
      System.out.println("It's too high. Try it again!");
    }
    else if (guess < number+10){
      System.out.println("It's too high, but close! Try it again!");
    }
    else if (guess <= number-10){
      System.out.println("It's too low! Try it again!");
    }
    else if (guess < number-10) {
      System.out.println("It's too low, but close! Try it again!");
    } else if (guess == number) {
      guessedTheNumber = true;
    }
    return guessedTheNumber;
  }
  
  
  public static int rangesToLives(int maxRange, int minRange) {
    int lives = 0;
    if (maxRange-minRange >=100){
      lives = 7;
    } else if (maxRange-minRange >= 50){
      lives = 5;
    }else {
      lives = 3;
    }
    return lives;
  }
  
  private static int guessingCheat(int lives) {
    boolean choice = true;
    while (choice){
      System.out.println("Type start if you are ready");
      String readyToStart = scanner.nextLine();
      if (readyToStart.equalsIgnoreCase("start")){
        choice = false;
      } else if (readyToStart.equalsIgnoreCase("bolondbea")){
        System.out.println("Cheat code activated!");
        lives = lives*2;
        System.out.println("You have " + lives + " lives left.");
        choice = false;
      } else if (readyToStart.equalsIgnoreCase("beababa")){
        System.out.println("Cheat code activated!");
        lives = lives*2;
        System.out.println("You have " + lives + " lives left.");
        choice = false;
      } else {
        System.out.println("Invalid command.");
        System.out.println("Game is running.");
        System.out.println();
        choice = false;
      }
    }
    return lives;
  }
}
