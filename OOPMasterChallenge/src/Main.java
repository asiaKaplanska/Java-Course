public class Main {

    public static void main(String[] args) {

        System.out.println("----------- Default Meal -----------");
        Meal meal = new Meal();

        System.out.println("----------- Customized Meal with Burger -----------");
        Drink drink = new Drink("Sprite", "large");
        SideItem sideItem = new SideItem("Sweet potato fries");
        Burger burger = new Burger("Cheeseburger", 5.99);

        burger.addExtraTopping(2);

        Meal meal1 = new Meal(drink, sideItem, burger);

        System.out.println("----------- Customized Meal with Deluxe Burger -----------");
        Drink drink1 = new Drink("Ice Tea", "small");
        SideItem sideItem1 = new SideItem("Nuggets");
        DeluxeBurger deluxeBurger = new DeluxeBurger("BigBurger");

        Meal meal2 = new Meal(drink1, sideItem1, deluxeBurger);
    }
}
