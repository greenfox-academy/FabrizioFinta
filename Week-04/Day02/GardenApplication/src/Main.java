public class Main {
  public static void main(String[] args) {
    Tree aTree = new Tree("blue");
    Tree anotherTree = new Tree("green");
    Flower aFlower = new Flower("Yellow");
    Flower anotherFlower = new Flower("pink");
    //TODO ask how to i create a method what could add multiple of plants or all my existing plants
    Garden myGarden = new Garden();
    myGarden.addPlant(aTree);
    myGarden.addPlant(anotherTree);
    myGarden.addPlant(aFlower);
    myGarden.addPlant(anotherFlower);
    
    myGarden.getGardenStatus();
    System.out.println();
    myGarden.waterTheGarden(40);
    System.out.println();
    myGarden.getGardenStatus();
    System.out.println();
    myGarden.waterTheGarden(70);
    System.out.println();
    myGarden.getGardenStatus();
    
  }
  
}
