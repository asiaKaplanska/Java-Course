public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        if (reverseNumber(number) == number) {
            return true;
        }
        return false;
    }

    public static int reverseNumber(int number) {
        int reverse = 0;
        do {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        } while (number != 0);

        return reverse;
    }

}