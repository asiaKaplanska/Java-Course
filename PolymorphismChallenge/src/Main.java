public class Main {

    public static void main(String[] args) {

        Car gasCar = new GasPoweredCar(9.3, 4);
        Car electricCar = new ElectricCar(32.5, 500);
        Car hybridCar = new HybridCar(7.1, 300, 6);

        gasCar.startEngine();
        gasCar.drive();

        System.out.println("_ _ _ _ _ _ _ _ _");

        electricCar.startEngine();
        electricCar.drive();

        System.out.println("_ _ _ _ _ _ _ _ _");

        hybridCar.startEngine();
        hybridCar.drive();

    }
}
