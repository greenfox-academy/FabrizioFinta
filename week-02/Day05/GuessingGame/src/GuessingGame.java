import java.util.Scanner;

public class GuessingGame {
  
  public static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    boolean gameRun = true;
    while (gameRun) {
      System.out.println("Please enter the minimum range of the guessing game: ");
      int minRange = scanner.nextInt();
      System.out.println("Please enter the maximum range of the guessing game: ");
      int maxRange = scanner.nextInt();
      System.out.println();
      System.out.println("Thank you!");
      System.out.println();
  
      int lives = rangesToLives(maxRange, minRange);
      //lives = guessingCheat(lives, shallWeStart); //debug needed
  
        int randomNumber = (int) (Math.random() * maxRange) + minRange;
        System.out.println(randomNumber);
  
        boolean isThereAnyLivesLeft = true;
        while (isThereAnyLivesLeft) {
          isThereAnyLivesLeft = lives > 0;
          System.out.println("You have " + lives + " lives left.");
          System.out.println("Which number i thought in the range of " + minRange + " and " + maxRange + "?");
          int guess = scanner.nextInt();
          if (! tipChecker(guess, randomNumber)) {
            lives = lives - 1;
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
        if (wantToPlay.equalsIgnoreCase("yes")){
          gameRun = true;
        } else if (wantToPlay.equalsIgnoreCase("no")){
          System.out.println("Hope you had a good time! See you!");
          gameRun = false;
        }
        else {
          System.out.println("You seem to be tired. See you later!");
          gameRun = false;
        }
      }
    }
  
  public static boolean tipChecker(int guess, int number) {
    boolean guessedTheNumber = false;
    if (guess == number) {
      guessedTheNumber = true;
    } else if (guess > number+10){
      System.out.println("It's too high. Try it again!");
    } else if (guess > number){
     System.out.println("It's too high, but close! Try it again!");
    } else if (guess < number-10){
      System.out.println("It's too low! Try it again!");
    } else if (guess < number) {
      System.out.println("It's too low, but close! Try it again!");
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
  
  public static int guessingCheat(int lives, String readyToStart) {
    boolean choice = true;
    while (choice){
      System.out.println("Please type start if you are ready:");
      String shallWeStart = scanner.nextLine();
      if (readyToStart.equalsIgnoreCase("start")){
        choice = false;
      } else if (readyToStart.equalsIgnoreCase("cheat1")){
        System.out.println("Cheat code activated!");
        lives = lives*2;
        System.out.println("You have " + lives + " lives left.");
        choice = false;
      } else if (readyToStart.equalsIgnoreCase("cheat2")){
        System.out.println("Cheat code activated!");
        lives = lives*2;
        System.out.println("You have " + lives + " lives left.");
        choice = false;
      } else {
        System.out.println("Invalid command.");
        //System.out.println("Game is running.");
        System.out.println();
        choice = true;
      }
    }
    return lives;
  }
}
