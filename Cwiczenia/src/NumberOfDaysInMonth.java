public class NumberOfDaysInMonth {
    // write your code here
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

        int DaysInMonth = 31;

        if (isLeapYear(year) == true && month == 2) {
            DaysInMonth = 29;
        }

        if (isLeapYear(year) == false && month == 2) {
            DaysInMonth = 28;
        }

        switch (month) {
            case 4: case 6: case 9: case 11: DaysInMonth = 30; break;
        }

        return DaysInMonth;
    }
}