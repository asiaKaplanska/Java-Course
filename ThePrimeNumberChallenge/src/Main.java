public class Main {

    public static void main(String[] args) {
//        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
//        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
//
//        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
//        System.out.println("9 is " + (isPrime(9) ? "" : "NOT ") + "a prime number");
//        System.out.println("17 is " + (isPrime(17 ) ? "" : "NOT ") + "a prime number");
        counterPrimeNumbers();
    }

    public static boolean isPrime (int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int counterPrimeNumbers () {

        int counter = 1;
        for (int i = 500; i <= 1000; i++) {
            if (isPrime(i) == true) {
                System.out.println("Prime number is equal = " + i + " and counter is equal = " + counter);
                counter++;
            }
            if (counter > 3) {
                break;
            }
        }
        return counter;
    }
}

