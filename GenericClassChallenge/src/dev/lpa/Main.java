package dev.lpa;

public class Main {
    public static void main(String[] args) {


        Park yosemite = new Park( new Coordinate(25.00, 32.00), "Yosemite");
        yosemite.render();

        River colorado = new River(new Coordinate(1.0, 2.0), new Coordinate(5.0, 4.0),
                new Coordinate(15.1, 16.2), "Colorado");
        colorado.render();
    }
}
