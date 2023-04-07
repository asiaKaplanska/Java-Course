public class Burger {

    private String type;
    private double basePrice;


    public Burger(String type, double basePrice) {
        this.type = type;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
            return basePrice;
    }

    public String getType() {
        return type;
    }

    public void addExtraTopping(int numberToppings) {
        double toppingPrice = 1.5;
        if (numberToppings < 0) {
           System.out.println("You can add only positive number of toppings!");
        } else if (numberToppings == 1) {
            basePrice += toppingPrice;
            System.out.println("One topping added to a hamburger");
        } else if (numberToppings == 2) {
            basePrice += (2 * toppingPrice);
            System.out.println("Two toppings added to a hamburger");
        } else {
            System.out.println("Invalid number of toppings... \n" +
                    "Available only up to two toppings!");
        }
    }

    public void burger() {
        System.out.println("Cost of " + type +  " is equals $" + basePrice);
    }

}
