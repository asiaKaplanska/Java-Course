public class Meal {

    private Drink drink;
    private SideItem sideItem;
    private Burger burger;
    private DeluxeBurger deluxeBurger;


    public Meal() {
        Drink drink = new Drink(DrinkType.PEPSI, DrinkType.MEDIUM);
        SideItem sideItem = new SideItem(SideItemType.NUGGETS);
        Burger burger = new Burger("Hamburger", 7.99);

        drink.drink();
        sideItem.sideItem();
        burger.addExtraTopping(1);
        burger.burger();

        double mealCost = drink.getPrice() + sideItem.getPrice() + burger.getBasePrice();
        System.out.println("Total cost: $" + mealCost);

    }

    public Meal(Drink drink, SideItem sideItem, Burger burger) {
        this.drink = drink;
        this.sideItem = sideItem;
        this.burger = burger;

        drink.drink();
        sideItem.sideItem();
        burger.burger();

        double mealCost = drink.getPrice() + sideItem.getPrice() + burger.getBasePrice();
        System.out.println("Total cost: $" + mealCost);
    }

    public Meal(Drink drink, SideItem sideItem, DeluxeBurger deluxeBurger) {
        this.drink = drink;
        this.sideItem = sideItem;
        this.deluxeBurger = deluxeBurger;

        drink.drink();
        sideItem.sideItem();
        deluxeBurger.burger();

        double mealCost = deluxeBurger.getBasePrice();
        System.out.println("Total cost: $" + mealCost);
    }
}
