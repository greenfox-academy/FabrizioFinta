public class Animals {
  
  private int hunger;
  private int thirst;
  private String name;
  
  public Animals(String name){
    this.name = name;
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat(String nameOfFood){
  this.hunger +=10;
    System.out.println("Moam-moam this " + nameOfFood + " is delicious!");
  }
  
  public void drink(String nameOfDrink) {
    this.thirst +=10;
    System.out.println("Gluggg-glugg i was so thirsty thank you to bringing me " + nameOfDrink);
  }
  
  public void play(String nameOfGame){
    this.thirst--;
    this.hunger--;
    System.out.println("Yaaay, i loved to play " + nameOfGame);
  }
  
  public void status(){
    System.out.println("My name is " + name);
    System.out.println("My hunger level is: " + hunger);
    System.out.println("My thirst level is " + thirst);
  }
}
