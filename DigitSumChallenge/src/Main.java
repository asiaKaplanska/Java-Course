 public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(-125));
    }
    public static int sumDigits (int number) {
        if (number < 0) {
            return -1;
        }

        var sum = 0;
        do {
            var n = number % 10;
            sum += n;
            number /= 10;
        } while (number != 0);
        return sum;
    }
}
