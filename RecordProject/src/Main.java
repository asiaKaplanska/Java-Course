public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("*** 1 ***");

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        System.out.println();
        System.out.println("*** 2 ***");

        Student pojoStudent = new Student("S923006", "Ann",
                "05/11/1985", "Java MasterClass");

        LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                "05/11/1985", "Java MasterClass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println();
        System.out.println("*** 3 ***");

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());

        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());


    }
}
