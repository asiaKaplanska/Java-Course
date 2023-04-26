import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double maxValue = Double.MIN_VALUE;
        double minValue = Double.MAX_VALUE;

        while (true) {
            try {
                System.out.println("Enter number: ");
                double userInput = Double.parseDouble(scanner.nextLine());

                maxValue = (userInput > maxValue) ? userInput : maxValue;
                minValue = (userInput < minValue) ? userInput : minValue;

                System.out.println("Maximum number entered is equal: " + maxValue);
                System.out.println("Minimum number entered is equal: " + minValue);

            } catch (NumberFormatException nFE) {
                System.out.println("Entered data is not a number -> GAME OVER");
                break;
            }
        }

    }
}
