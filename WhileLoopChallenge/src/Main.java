public class Main {
    public static void main(String[] args) {

        int testNumber = 5;
        int finishNumber = 20;
        int evenCounter = 0;
        int oddCounter = 0;

        while (testNumber <= finishNumber && evenCounter < 5) {
            if (isEvenNumber(testNumber) == true) {
                System.out.println(testNumber);
                evenCounter++;
            } else {
                oddCounter++;
            }
            testNumber++;
        }

        System.out.printf("The total number of even numbers = %d and odd numbers = %d", evenCounter, oddCounter);

    }

    public static boolean isEvenNumber (int userNumber) {
        if (userNumber % 2 == 0) {
            return true;
        }
        return false;
    }
}
