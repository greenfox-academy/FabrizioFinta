public class Plants {

  private String color;
  private int currentWaterAmount;
  private int idealWaterNeed;
  private boolean needWater;
  
  public void setColor(String color) {
    this.color = color;
  }
  public String getColor() {
    return color;
  }
  
  public void setIdealWaterNeed(int idealWaterNeed) {
    this.idealWaterNeed = idealWaterNeed;
  }
  public int getIdealWaterNeed() {
    return idealWaterNeed;
  }
  
  public void setCurrentWaterAmount(int currentWaterAmount) {
    this.currentWaterAmount = currentWaterAmount;
  }
  public int getCurrentWaterAmount() {
    return currentWaterAmount;
  }
  
  public boolean getNeedWater(){
    if (getCurrentWaterAmount() < getIdealWaterNeed()){
      return this.needWater = false;
    } else {
      return this.needWater = true;
    }
  }
}

