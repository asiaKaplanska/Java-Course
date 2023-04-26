public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public void addWater() {
       brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean addWater, boolean pourMilk,
                                boolean loadDishwasher) {
        if (addWater) {
            addWater();
        }
        if (pourMilk) {
            pourMilk();
        }
        if (loadDishwasher) {
            loadDishwasher();
        }
    }

    public void doKitchenWork() {
        iceBox.orderFood();
        dishWasher.doDishes();
        brewMaster.brewCoffee();
    }
}
