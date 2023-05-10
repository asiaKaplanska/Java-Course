package dev.lpa;

public interface Mappable {

    String getLabel();
    String getGeometryType();
    String getIconType();

    String JSON_PROPERTY = """
            "properties": {%s}""";
    default String toJSON() {
       return """
               "type": "%s", "label": "%s", "marker": "%s" """
               .formatted(getGeometryType(), getLabel(), getIconType());
    }

    static void printMappableProperties(Mappable mappable) {

        System.out.println(String.format(JSON_PROPERTY, mappable.toJSON()));
    }



}
