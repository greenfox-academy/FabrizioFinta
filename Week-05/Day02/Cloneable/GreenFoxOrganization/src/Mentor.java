public class Mentor extends Person {
  String level;
  
  public Mentor(String name, int age, String gender, String level){
    setName(name);
    setAge(age);
    setGenger(gender);
    this.level = level;
  }
  
  public Mentor(){
    setName("Jane Doe");
    setAge(30);
    setGenger("female");
    this.level = "intermediate";
  }
  
  public void getGoal(){
    System.out.println("Educate brilliant junior software developers.");
  }
  
  public void introduce(){
    System.out.println("Hi , I'm " + getName() + " a " + getAge() + " year old " + getGender() + level + " mentor");
  }
  
  
}
