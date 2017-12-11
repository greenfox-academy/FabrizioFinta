public class Counter {
  private Integer value;
  private Integer customValue;
  
  public Counter(){
  this.value = 0;
  this.customValue = 0;
  }
  public Counter(Integer value){
    this.value = value;
    this.customValue = value;
  }
  public void add(Integer number){
    this.value += number;
  }
  public void add(){
    this.value ++;
  }
  public int get(){
    return this.value;
  }
  public void reset(){
    this.value = customValue;
  }
}


