public class CodingHours {
    public static void main(String[] args) {
        float antendeeCodingHours = 6f;
        int semester = 17;
        int workHoursAWeek = ((semester * 7) - (17 * 2)) * 6;
        int avarage = 52;
        float percentage = ((antendeeCodingHours * 5) / avarage)*100;
        int percentageint = (int) percentage;
        String HoursSpent = "There were " + workHoursAWeek + " hours spent with coding.";
        System.out.println(HoursSpent);
        String percentagePrinted = "Its the " + percentageint + "% of the total work hours.";
        System.out.println(percentagePrinted);
    }   
}
