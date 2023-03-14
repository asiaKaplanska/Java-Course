public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        int rowCount = number;
        int columnCount = number;

        String star = "*";

        for (int i = 0; i < number; i++){       // i == wiersz,    j == kolumna
            for (int j = 0; j < number; j++) {
                if (i == 0 || i == number - 1) {
                    System.out.print(star);
                }
                else if (j == 0 || j == number - 1) {
                    System.out.print(star);
                }
                else if (i == j) {
                    System.out.print(star);
                }
                else if (j == rowCount - i - 1) {
                    System.out.print(star);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}