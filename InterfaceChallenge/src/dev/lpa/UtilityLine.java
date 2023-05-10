package dev.lpa;

public class UtilityLine implements Mappable {
    String label;
    String iconType;
    String utility;

    public UtilityLine(String label, String iconType, String utility) {
        this.label = label;
        this.iconType = iconType;
        this.utility = utility;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getGeometryType() {
        return String.valueOf(GeometryType.LINE);
    }

    @Override
    public String getIconType() {
        return iconType;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "utility": "%s" """.formatted(utility);
    }
}
