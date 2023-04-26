public class Car {

    private String description;

    public void startEngine() {
        runEngine();
    }

    public void drive() {
        System.out.println("Car is driving...");
    }

    protected void runEngine() {
        System.out.println("Starting " + getClass().getSimpleName() +
                "'s engine...Brum!");
    }
}
