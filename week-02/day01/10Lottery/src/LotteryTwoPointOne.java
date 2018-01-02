import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class LotteryTwoPointOne {
  public static void main(String[] args) {
    
    Path lotteryStatics = Paths.get("statics.txt");
    fiveMostCommonNumbersEver(lotteryStatics);
    
  }
  
  private static void fiveMostCommonNumbersEver(Path lotteryStatics) {
    try {
      ArrayList<String> fileArray = new ArrayList<>(Files.readAllLines(lotteryStatics));
      ArrayList<Integer> LuckyNumbers = new ArrayList<>();
      for (int i = 0; i < fileArray.size(); i++) {
        String line = fileArray.get(i);
        ArrayList<String> tempArray = new ArrayList<>(Arrays.asList(line.substring(line.lastIndexOf("t;")+2).split(";")));
        for (int j = 0; j < tempArray.size(); j++) {
          LuckyNumbers.add(Integer.parseInt(tempArray.get(j)));
        }
      }
      Collections.sort(LuckyNumbers);
      HashMap<Integer, Integer> map = new HashMap<>();
      int counter = 0;
      for (int i = 0; i < LuckyNumbers.size(); i++) {
        if (i==LuckyNumbers.size()-2){
          counter++;
          map.put(LuckyNumbers.get(i),counter);
          break;
        }
        if (LuckyNumbers.get(i).equals(LuckyNumbers.get(i+1))){
          counter++;
        } else {
          map.put(LuckyNumbers.get(i),counter);
          counter=0;
        }
      }
      Object[] a = map.entrySet().toArray();
      Arrays.sort(a, new Comparator() {
        public int compare(Object o1, Object o2) {
          return ((Map.Entry<String, Integer>) o2).getValue()
                         .compareTo(((Map.Entry<String, Integer>) o1).getValue());
        }
      });
      for (Object e : a) {
        System.out.println(((Map.Entry<Integer, Integer>) e).getKey() + " : " + ((Map.Entry<Integer, Integer>) e).getValue());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
