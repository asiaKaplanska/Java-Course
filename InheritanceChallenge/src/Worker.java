public class Worker {

    protected String name;
    protected String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int workerBirthDate = Integer.parseInt(birthDate);
        int currentYear = 2023;
        return currentYear - workerBirthDate;
    }

    public double collectPay() {
        return 0.00;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
        System.out.println("Worker's terminate date is " + endDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
