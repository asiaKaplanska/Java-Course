public class HybridCar extends Car{

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println(getClass().getSimpleName() + " engine started." +
                "It has " + cylinders + " cylinders." +
                "It did it very quietly because using" +
                batterySize + " battery to run engine.");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("You drive by " + getClass().getSimpleName() +
                " so average km/litre equals " + avgKmPerLitre);
    }
}
