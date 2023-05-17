package dev.lpa;

public class Park extends Point {

    private String name;

    public Park(Coordinate coord, String name) {
        super(coord);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println("Render " + name + " as POINT (" + coord.toString() + ")");
    }
}
