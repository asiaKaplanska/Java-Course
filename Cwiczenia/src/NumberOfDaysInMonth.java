public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            return year % 100 != 0 || year % 400 == 0;
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }

        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> calculateFebruary(year);
            default -> 31;
        };
    }

    private static int calculateFebruary(int year) {
        int daysInMonth = 28;

        if (isLeapYear(year)) {
            daysInMonth = 29;
        }

        return daysInMonth;
    }
}