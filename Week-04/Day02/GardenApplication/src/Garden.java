import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> allMyPlants;
 
  public Garden() {
    allMyPlants = new ArrayList<>();
  }
  
  public void addPlant(Plant plant){
    allMyPlants.add(plant);
  }
  
  public void getGardenStatus(){
    for (int index = 0; index < allMyPlants.size(); index++) {
      allMyPlants.get(index).getStatus();
    }
  }
  
  public void waterTheGarden(int amountOfWater){
    List<Plant>thirstyPlants = new ArrayList<>();
    for (int index = 0; index < allMyPlants.size(); index++) {
      if (allMyPlants.get(index).getNeedWater()){
        thirstyPlants.add((allMyPlants.get(index)));
      }
    }
    int waterPerPlant = amountOfWater/thirstyPlants.size();
    for (int index = 0; index < thirstyPlants.size(); index++) {
      thirstyPlants.get(index).watering(waterPerPlant);
    }
    System.out.println("Garden watered with " + amountOfWater + " amount of water");
    System.out.println("Number of thirsty plants was: " + thirstyPlants.size());
    System.out.println("Water per plant: " + waterPerPlant);
  }
}
