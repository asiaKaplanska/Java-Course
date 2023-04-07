public class Drink {

    private String type;
    private String size;
    private double price;

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        price = switch (this.size) {
            case "small" -> 1.75;
            case "medium" -> 2.5;
            case "large" -> 3.0;
            default -> throw new IllegalStateException("Invalid size: " + this.size);
        };
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public void drink() {
        System.out.println("Cost of selected " + type + " at " + size + " size is equals $" + price);
    }
}
