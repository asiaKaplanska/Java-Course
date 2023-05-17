package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapObject implements Mappable {

    private String name;
    private List<Coord> coords = new ArrayList<>();
    private ObjectType type;
    private MapType mapType;

    public MapObject(String name, ObjectType type, MapType mapType, Coord... coords) {
        this.name = name;
        this.type = type;
        this.mapType = mapType;
        this.coords.addAll(Arrays.asList(coords));
    }

    @Override
    public void render() {
        System.out.println(String.format("Render %s %s as %s (%s)", name, mapType, type, coords));
    }
}
