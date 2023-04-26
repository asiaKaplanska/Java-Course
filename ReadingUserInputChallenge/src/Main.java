import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while (count < 5) {
            System.out.printf("Enter number #%d: ", count + 1);

            try {
                int userInput = Integer.parseInt(scanner.nextLine());
                sum += userInput;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }
        System.out.println(sum);

    }



}
