public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(65, 145));
    }

    public static String getDurationString (int seconds) {
        if (seconds >= 0) {
            int hours = seconds / 3600;
            int minutes = (seconds - hours * 3600) / 60;
            int remainSeconds = seconds - hours * 3600 - minutes * 60;
            return (hours + "h " + minutes + "m " + remainSeconds + "s");
        }
       return "Amount of seconds should be equal or greater than 0";
    }
    public static String getDurationString (int minutes, int seconds) {
        if (seconds >= 0 && minutes >= 0 && seconds <= 59) {
           return getDurationString(minutes * 60 + seconds);
        }
        return "Amount of seconds should be in range between 0 and 59 inclusive and amount of minutes should be equal or greater than 0";
    }
}
