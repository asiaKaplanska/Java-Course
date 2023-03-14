public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(30, 12));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int r = 0;
        int x = 0;
        int y = 0;

        if (first > second) {
            x = first;
            y = second;
        }

        if (first <= second) {
            x = second;
            y = first;
        }

        while (true) {
            r = x % y;
            if (r == 0) {
                break;
            }
            x = y;
            y = r;
        }
        return y;
    }
}