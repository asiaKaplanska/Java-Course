public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Grain");
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        addHamburgerAddition1(healthyExtra1Name, healthyExtra1Price);
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        addHamburgerAddition2(healthyExtra2Name, healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Healthy Burger contains " + healthyExtra1Name +
                " and " + healthyExtra2Name);
        return super.itemizeHamburger();
    }
}
