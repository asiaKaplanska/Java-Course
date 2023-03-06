public class Main {
    public static void main(String[] args) {

        // System.out.println("New score is " + calculateScore("Tim", 500));
        // System.out.println("New score is " + calculateScore(10));

        double first = convertToCentimeters(5);
        System.out.println(first);

        double second = convertToCentimeters(3, 7);
        System.out.println(second);

    }
    public static int calculateScore (String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore (int score) {

        return calculateScore("Anonymous", score);
    }

    public static int calculateScore () {

        System.out.println("No player name, no player score");
        return 0;
    }

    public static double convertToCentimeters (int heightInInches) {
        double heightInCentimeters = (double) (heightInInches * 2.54);
        return heightInCentimeters;
    }

    public static double convertToCentimeters (int heightInFeet, int heightInInches) {
        int totalInchesHeight = heightInFeet * 12 + heightInInches;
        double heightInCentimeters = convertToCentimeters(totalInchesHeight);
        return heightInCentimeters;
    }
}
