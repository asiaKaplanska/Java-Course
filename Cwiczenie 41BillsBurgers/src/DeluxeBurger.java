public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Chicken", 19.10, "Basic");
        addHamburgerAddition1("Chips", 3.00);
        addHamburgerAddition2("Drink", 1.10);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("No additional items: " + addition1Name + 
                "can be added to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("No additional items: " + addition2Name +
                "can be added to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("No additional items: " + addition3Name +
                "can be added to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("No additional items: " + addition4Name +
                "can be added to a deluxe burger.");
    }
}
