public class Main {

    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen(new CoffeeMaker(),
                new DishWasher(), new Refrigerator());

        smartKitchen.setKitchenState(true, true, false);
        smartKitchen.doKitchenWork();

    }
}
