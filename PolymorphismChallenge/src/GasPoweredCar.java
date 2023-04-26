public class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println(getClass().getSimpleName() + " engine started." +
                "It has " + cylinders + " cylinders.");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("You drive by " + getClass().getSimpleName() +
                " so average km/litre equals " + avgKmPerLitre);
    }
}
