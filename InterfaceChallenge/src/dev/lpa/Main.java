package dev.lpa;

public class Main {
    public static void main(String[] args) {

        Mappable house = new Building("small white house with garden full of flowers",
                "black house", "my home");
        Mappable waterPipe = new UtilityLine("hot water pipe", "blue continue line", "provide hot water to my house");

        Mappable.printMappableProperties(house);
        Mappable.printMappableProperties(waterPipe);
    }
}
