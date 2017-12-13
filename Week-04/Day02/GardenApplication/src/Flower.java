public class Flower extends Plant {
  
  public Flower(String color){
    super.setColor(color);
    super.setIdealWaterNeed(5);
    super.ABSORBED_WATER_PERCENT = 75;
  }
  
  @Override
  protected void watering(int amountOfWater) {
    setCurrentWaterAmount((amountOfWater * ABSORBED_WATER_PERCENT)/100);
  }
  
  //TODO ask how could i define and then redefine the final int in the parent class.
  
}
