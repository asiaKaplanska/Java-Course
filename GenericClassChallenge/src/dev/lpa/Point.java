package dev.lpa;

public class Point implements Mappable {

    protected Coordinate coord;

    public Point(Coordinate coord) {
        this.coord = coord;
    }

    @Override
    public void render() {

    }
}
