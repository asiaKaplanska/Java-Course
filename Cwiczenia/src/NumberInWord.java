public class NumberInWord {
    // write your code here
    public static void printNumberInWord (int number) {
        String NumberInWord = "OTHER";
        switch (number) {
            case 0 : NumberInWord = "ZERO"; break;
            case 1 : NumberInWord = "ONE"; break;
            case 2 : NumberInWord = "TWO"; break;
            case 3 : NumberInWord = "THREE"; break;
            case 4 : NumberInWord = "FOUR"; break;
            case 5 : NumberInWord = "FIVE"; break;
            case 6 : NumberInWord = "SIX"; break;
            case 7 : NumberInWord = "SEVEN"; break;
            case 8 : NumberInWord = "EIGHT"; break;
            case 9 : NumberInWord = "NINE"; break;
        }
        System.out.println(NumberInWord);
    }
}