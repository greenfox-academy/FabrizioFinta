public class Student extends Person implements Cloneable {
  
  private String perviousOrganization;
  private int skippedDays;
  
  
  public Student(String name, int age, String gender, String previousOrganization) {
    setName(name);
    setAge(age);
    setGenger(gender);
    this.perviousOrganization = previousOrganization;
    this.skippedDays = 0;
  }
  
  public Student() {
    setName("Jane Doe");
    setAge(30);
    setGenger("female");
  }
  
  public void getGoal() {
    System.out.println(" My goal is to be a junior software developer.");
  }
  
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + " a " + getAge() + " year old " + getGender() + " from " + getOrganization() + " who skipped " + skippedDays + " from the course already.");
  }
  
  public String getOrganization() {
    return perviousOrganization;
  }
  
  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }
  
  public Student clone() throws CloneNotSupportedException {
    return (Student) super.clone();
  }
}

