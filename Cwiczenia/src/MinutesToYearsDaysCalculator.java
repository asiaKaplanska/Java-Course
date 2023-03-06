public class MinutesToYearsDaysCalculator {
    // write your code here

    public static final long MinutesToHour = 60;
    public static final long HoursToDay = 24;
    public static final long DaysToYear = 365;
    public static final long MinutesToYears = MinutesToHour * HoursToDay * DaysToYear;

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long years = minutes / MinutesToYears;
            long days = (minutes - years * MinutesToYears) / (MinutesToHour * HoursToDay);

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}