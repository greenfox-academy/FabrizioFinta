public class Person {

  private String name;
  private int age;
  private String gender;
  
  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  
  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }
  
  public void introduce(){
    System.out.println("Hi, I'm " + getName() + " a " + getAge() + " old " + getGender());
  }
  
  public void getGoal() {
    System.out.println("My goal is live for the moment!");
  }
  
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  public int getAge() {
    return age;
  }

  public void setGenger(String gender){
    this.gender = gender;
  }
  public String getGender (){
     return gender;
  }
  
}
