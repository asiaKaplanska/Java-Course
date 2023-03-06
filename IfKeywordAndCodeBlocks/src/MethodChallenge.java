public class MethodChallenge {
    public static void main(String[] args) {

        String playerName = "Raduś";
        int playerScore = 1000;
        int playerPositionScore = calculateHighScorePosition(playerScore);

        displayHighScorePosition(playerName, playerPositionScore);
    }
    public static void displayHighScorePosition (String playerName, int playerPositionScore) {
        System.out.println(playerName + " managed to get into position " + playerPositionScore + " on high score list");
    }
    public static int calculateHighScorePosition (int playerScore) {

        int resultNumber = 4;

        if (playerScore >= 1000){
            resultNumber = 1;
        } else if (playerScore >= 500) {
            resultNumber = 2;
        } else if (playerScore >= 100) {
            resultNumber = 3;
        }
        return resultNumber;
    }
}
