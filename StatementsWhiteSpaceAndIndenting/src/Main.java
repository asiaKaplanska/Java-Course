`

public class Main {
    public static void main(String[] args) {
        int myVariable = 50;        // 'myVariable = 50' is the expression,
                                    // 'int myVariable = 50;' is the statement

        myVariable++;       // this is a statement because of semicolon (;) at the end
        myVariable--;       // this is also a statement
                            // Without the semicolon 'myVariable++' is the expression

        System.out.println("This is a test");

        System.out.println("This is " +
                "another " +
                "still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable);

        if (myVariable == 0) {
            System.out.println("It's now zero");
        }
    }
}
`