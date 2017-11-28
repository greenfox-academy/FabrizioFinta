public class BMI {
    public static void main(String[] args) {
        double massInKg = 81.1;
        double heightInM = 1.78;

        double BMI = (massInKg / (heightInM * heightInM));
        System.out.println("Default BMI is: " + BMI);
    }
}
