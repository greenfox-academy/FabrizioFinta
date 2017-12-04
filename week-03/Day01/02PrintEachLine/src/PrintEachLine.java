import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class PrintEachLine {
  public static Path myFile = Paths.get("myfile.txt");
  public static Path myNonExistingFile = Paths.get("/src/myfile.txt");
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number)");
    System.out.println("1 = file is available");
    System.out.println("2 = file is not available");
    int choice = scanner.nextInt();
  
    if (choice == 1) {
      fileExist(myFile);
    } else if (choice == 2) {
      fileExist(myNonExistingFile);
    } else {
      System.out.println("You cant choose this number.");
    }
  }
  
  public static void fileExist(Path myFile) {
    try {
      List<String> lines = Files.readAllLines(myFile);
      for (String eachline : lines)
        System.out.println(eachline);
    } catch (IOException e) {
      System.out.println("Unable to read the file: myfile.txt");
    }
  }
}
