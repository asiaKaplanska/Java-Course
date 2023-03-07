public class MinutesToYearsDaysCalculator {
    // write your code here

    private static final long MINUTES_IN_HOURS = 60;
    private static final long HOURS_IN_DAY = 24;
    private static final long DAYS_IN_YEAR = 365;
    private static final long MINUTES_IN_YEAR = MINUTES_IN_HOURS * HOURS_IN_DAY * DAYS_IN_YEAR;

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            var years = minutes / MINUTES_IN_YEAR;
            var days = (minutes - years * MINUTES_IN_YEAR) / (MINUTES_IN_HOURS * HOURS_IN_DAY);

            //System.out.println(minutes + " min = " + years + " y and " + days + " d");

             // the other way to print result
            System.out.printf("%d min = %d y and %d d", minutes, years, days);
        }
    }
}