public class SecondsInADay {

    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int totalHours = 24;
        int totalMinutes = 60;
        int totalSeconds = 60;

        int remainingSeconds =  ((totalHours - currentHours)+(totalMinutes - currentMinutes) + (totalSeconds - currentSeconds)) * (int) Math.pow(60,2);
        System.out.println("Ramining seoncd accourding to stored time: " + remainingSeconds);
    }
}
