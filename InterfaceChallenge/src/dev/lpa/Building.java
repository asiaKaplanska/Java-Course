package dev.lpa;

public class Building implements Mappable{

    String label;
    String iconType;
    String name;

    public Building(String label, String iconType, String name) {
        this.label = label;
        this.iconType = iconType;
        this.name = name;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getGeometryType() {
        return String.valueOf(GeometryType.POINT);
    }

    @Override
    public String getIconType() {
        return iconType;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s" """.formatted(name);
    }
}
