public class Main {
    public static void main(String[] args) {

        char variable = 'A';
        switch (variable) {
            case 'A':
                System.out.println(variable + " = Able");
                break;
            case 'B':
                System.out.println(variable + " = Baker");
                break;
            case 'C':
                System.out.println(variable + " = Charlie");
                break;
            case 'D':
                System.out.println(variable + " = Dog");
                break;
            case 'E':
                System.out.println(variable + " = Easy");
                break;
            default:
                System.out.println(variable + " not found");
                break;
        }
    }
}
