package dev.lpa;

public class Main {
    public static void main(String[] args) {

        MapObject mapObject = new MapObject("Yosemite", ObjectType.POINT, MapType.PARK, new Coord(2.0, 3.5), new Coord(5.1, 7.0));
        mapObject.render();
    }
}
