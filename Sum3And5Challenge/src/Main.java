public class Main {

    public static void main(String[] args) {

        int number = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number that can be divided by both 3 & 5 is = " + i);
                number += i;
                counter++;
            }
            if (counter == 5) {
                break;
            }
        }
        System.out.println("Sum of all those numbers is equal = " + number);
    }
}
