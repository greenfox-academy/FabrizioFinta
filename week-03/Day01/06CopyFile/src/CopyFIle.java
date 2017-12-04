import com.sun.org.apache.xpath.internal.SourceTree;

import javax.activation.FileDataSource;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CopyFIle {
  public static Path fileName = Paths.get("topSecretFileEver");
  public static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("Please type the new files name in:");
    String copyName = scanner.nextLine() + ".txt";
    
    if (fileCopier(fileName, copyName)) {
      System.out.println("The file was successfully copied.");
    }
    else{
      System.out.println("Fucked up, check the original file.");
    }
  }
  
  private static boolean fileCopier(Path fileName, String copyName) {
    Path copiedFile = Paths.get(copyName);
    Boolean copySuccessful = null;
    try {
      List<String> originalFileContent = Files.readAllLines(fileName);
      for (String lines : originalFileContent) ;
      ArrayList<String> copiedFileContent = new ArrayList<>();
      copiedFileContent.addAll(originalFileContent);
      Files.write(copiedFile, originalFileContent);
      copySuccessful = true;
    } catch (IOException e) {
      copySuccessful = false;
    }
    return copySuccessful;
  }
}
