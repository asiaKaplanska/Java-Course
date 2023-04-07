public class SideItem {

    private String type;
    private double price;

    public SideItem(String type) {
        this.type = type;
        price = switch (this.type) {
            case "Fries" -> 3.5;
            case "Sweet potato fries" -> 4.0;
            case "Nuggets" -> 4.2;
            default -> 0;
        };
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void sideItem() {
        System.out.println("Cost of " + type +  " is equals $" + price);
    }
}
