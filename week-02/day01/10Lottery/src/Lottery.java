import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {
  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers statics.txt
  
    Path lotteryStatics = Paths.get("statics.txt");
    
    commonNumbers(lotteryStatics);
    
  }
  
  private static void commonNumbers(Path srcFile) {
  try {
    ArrayList<String> fileArray = new ArrayList<>(Files.readAllLines(srcFile));
    ArrayList<Integer> numberArray = new ArrayList<>();
    ArrayList<Integer> numberIncidence = new ArrayList<>();
    // HashMap<Integer, Integer> numberInc = new HashMap<>();    future feature
    for (int index = 0; index < fileArray.size(); index++) { //get the substring in every line after the "Ft"
      String lineOfTheArray = fileArray.get(index);
      lineOfTheArray = lineOfTheArray.substring(lineOfTheArray.lastIndexOf("t;")+2, lineOfTheArray.length());
      //Which line has the last t; the lucky numbers are starting from there
      fileArray.set(index, lineOfTheArray); //Remove the useless data and replace the lucky numbers
      System.out.println(fileArray.get(0));
      for (int indexChar = 0; indexChar < lineOfTheArray.length() - 3; indexChar++) { //Remove the unnecessary Strings && convert to int
        if (fileArray.get(index).charAt(indexChar) == ';' &&
                    fileArray.get(index).charAt(indexChar + 3) == ';' || fileArray.get(index).charAt(indexChar + 3) == ',') {
          //max digits: 2 -- In case of two-digit numbers:
          Character temp = fileArray.get(index).charAt(indexChar + 1); //character to integer conversion
          Character temp2 = fileArray.get(index).charAt(indexChar + 2);
          numberArray.add(temp.getNumericValue(temp) * 10 + temp2.getNumericValue(temp2)); //making a two digit number from characters
          
        } else if (fileArray.get(index).charAt(indexChar) == ';') {
          //in case of one digit numbers
          Character temp = fileArray.get(index).charAt(indexChar + 1);
          numberArray.add(temp.getNumericValue(temp));
        } else {
        }
      }
    }
    for (int i = 0; i < 5; i++) {
    }
    
    /*for (int index = 1; index <= numberArray.size(); index++) {
      numberIncidence.add(index, Collections.frequency(numberArray, index-1));
    } */
    /*
    Object[] a = numberInc.entrySet().toArray();
    Arrays.sort(a, new Comparator() {
      public int compare(Object o1, Object o2) {
        return ((Map.Entry<String, Integer>) o2).getValue()
                       .compareTo(((Map.Entry<String, Integer>) o1).getValue());
      }
    });
    System.out.println("This number " +  + " was played by " +  + " times.");
    */
    
      } catch (IOException e){
    System.err.println("Something went wrong. Check the source file.");
  } catch (ArrayIndexOutOfBoundsException e) {
    System.err.println("Something went wrong with the Array index.");
    System.out.println("Check the loop" + e);
  }
  }
}
