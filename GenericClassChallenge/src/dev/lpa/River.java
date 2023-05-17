package dev.lpa;

public class River extends Line {

    private String name;

    public River(Coordinate startCoord, Coordinate middleCoord, Coordinate endCoord, String name) {
        super(startCoord, middleCoord, endCoord);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println("Render " + name + " as LINE (" +
                startCoord.toString() + ", " + middleCoord.toString() + ", " + endCoord.toString() + ")");
    }
}
