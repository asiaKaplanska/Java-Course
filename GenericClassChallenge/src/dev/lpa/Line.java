package dev.lpa;

public class Line implements Mappable {

    protected Coordinate startCoord;
    protected Coordinate middleCoord;
    protected Coordinate endCoord;

    public Line(Coordinate startCoord, Coordinate middleCoord, Coordinate endCoord) {
        this.startCoord = startCoord;
        this.middleCoord = middleCoord;
        this.endCoord = endCoord;
    }

    @Override
    public void render() {
    }
}
