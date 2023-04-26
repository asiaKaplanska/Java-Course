public class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(double avgKmPerCharge, int batterySize) {
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println(getClass().getSimpleName() + " engine started." +
                "It did it very quietly because has no fuel but use " +
                batterySize + " battery to run engine.");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("You drive by " + getClass().getSimpleName() +
                " so average km/charge equals " + avgKmPerCharge);
    }
}
