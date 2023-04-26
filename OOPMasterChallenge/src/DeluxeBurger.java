public class DeluxeBurger extends Burger{

    // private final double PRICE = 20.99;

    public DeluxeBurger(String type) {
        super(type, 20.99);

    }

    @Override
    public void addExtraTopping(int toppings) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Added " + " toppings");
        }
        if (toppings < 0 || toppings > 5) {
            System.out.println("Invalid numbers of toppings!");
        }
    }

}
