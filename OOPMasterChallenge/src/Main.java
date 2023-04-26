public class Main {

    public static void main(String[] args) {

        System.out.println("----------- Default Meal -----------");
        Meal meal = new Meal();

        System.out.println("----------- Customized Meal with Burger -----------");
        Drink drink = new Drink(DrinkType.PEPSI, DrinkType.LARGE);
        SideItem sideItem = new SideItem(SideItemType.SWEET_FRIES);
        Burger burger = new Burger("Cheeseburger", 5.99);

        burger.addExtraTopping(2);

        Meal meal1 = new Meal(drink, sideItem, burger);

        System.out.println("----------- Customized Meal with Deluxe Burger -----------");
        Drink drink1 = new Drink(DrinkType.SPRITE, DrinkType.SMALL);
        SideItem sideItem1 = new SideItem(SideItemType.NUGGETS);
        DeluxeBurger deluxeBurger = new DeluxeBurger("BigBurger");

        Meal meal2 = new Meal(drink1, sideItem1, deluxeBurger);
    }
}
