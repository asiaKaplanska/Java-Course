public class MinutesToYearsDaysCalculator {
    private static final long MINUTES_IN_HOUR = 60;
    private static final long HOURS_IN_DAY = 24;
    private static final long DAYS_IN_YEAR = 365;
    private static final long MINUTES_IN_YEAR = MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_YEAR;

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        var years = toYears(minutes);
        var remainingMinutes = minutes - toMinutes(years);
        var days = toDays(remainingMinutes);

        // System.out.println(minutes + " min = " + years + " y and " + days + " d");

        // the other way to print result
        System.out.printf("%d min = %d y and %d d", minutes, years, days);
    }

    private static long toYears(long minutes) {
        return (minutes / MINUTES_IN_YEAR);
    }

    private static long toDays(long minutes) {
        return minutes / (MINUTES_IN_HOUR * HOURS_IN_DAY);
    }

    private static long toMinutes(long years) {
        return years * MINUTES_IN_YEAR;
    }
}