import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long average = 0L;

        while (true) {
            try {
                System.out.println("Enter number: ");
                int userInput = Integer.parseInt(scanner.nextLine());
                sum += userInput;
                count++;
                average = Math.round(((double)sum) / ((double)count));

            } catch (NumberFormatException nfe) {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
    }
}