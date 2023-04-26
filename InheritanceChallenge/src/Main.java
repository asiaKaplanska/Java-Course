public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "1985", "2001",
                "2000");
        SalariedEmployee joe = new SalariedEmployee("Joe", "1990", "2023",
                35000);


        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
        System.out.println("_ _ _ _");

        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension ckeck = $" + joe.collectPay());
        System.out.println("_ _ _ _");

        HourlyEmployee mary = new HourlyEmployee("Mary", "1970", "2021",
                15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's holiday pay = $" + mary.getDoublePay());
    }
}
