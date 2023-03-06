public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello, Asius");
//
//        boolean isAlien = false;
//        if (isAlien == false) {
//            System.out.println("It is not an alien!");
//            System.out.println("And I am scrared of aliens");
//        }
//
//        int topScore = 80;
//        if (topScore <= 100) {
//            System.out.println("You got the high core!");
//        }
//
//        int secondTopScore = 95;
//        if ((topScore > secondTopScore) && (topScore < 100)) {
//            System.out.println("Greater than second top score and less than 100");
//        }
//
//        if ((topScore > 90) || (secondTopScore <= 90)) {
//            System.out.println("Either or both of the conditions are true");
//        }
//
//        int newValue = 50;
//        if (newValue == 50) {
//            System.out.println("This is true");
//        }
//
//        boolean isCar = false;
//        if (!isCar) {
//            System.out.println("This is not supposed to happen");
//        }
//
//        String makeOfCar = "Volkswagen";
//        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
//
//        if (isDomestic) {
//            System.out.println("This car is domestic to our country");
//        }
//
//        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
//        System.out.println(s);

        double firstVar = 20.00;
        double secondVar = 80.00;
        double trirdStep = (firstVar + secondVar) * 100.00;
        System.out.println("Trird step is equal: " + trirdStep);
        double fourthStep = trirdStep % 40.00;
        System.out.println("Fourth step is equal: " + fourthStep);
        boolean isStepFourZero = fourthStep == 0.00 ? true : false;
        System.out.println("Boolean variable is equal: " + isStepFourZero);
        if (isStepFourZero == false){
            System.out.println("Got some reminder");
        }
    }
}
