public class DeluxeBurger{

    private String type;
    private static double price = 20.99;

    public DeluxeBurger(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    private void addToppings(int toppings) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Added " + " toppings");
        }
        if (toppings < 0 || toppings > 5) {
            System.out.println("Invalid numbers of toppings!");
        }
    }

    public void deluxeBurger() {
        System.out.println("Cost of " + type +  " is equals $" + price);
    }
}
