public class Sponsor extends Person {

  String company;
  int hiredStudents;
  
  public Sponsor(String name, int age, String gender, String company){
    setName(name);
    setAge(age);
    setGenger(gender);
    this.company = company;
    this.hiredStudents = 0;
  }
  
  public Sponsor(){
    setName("Jane Doe");
    setAge(30);
    setGenger("female");
    this.company = "Google";
    this.hiredStudents = 0;
  }
  
  public void introduce(){
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender()
                               + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void hire(){
    this.hiredStudents++;
  }
  
  public void getGoal(){
    System.out.println("Hire brilliant junior software developers.");
  }
  
}
