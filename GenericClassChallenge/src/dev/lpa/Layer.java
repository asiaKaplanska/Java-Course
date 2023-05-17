package dev.lpa;

import java.util.List;

public class Layer <T extends Mappable> {

    private List<Mappable> mappableList;

    public Layer(List<Mappable> mappableList) {
        this.mappableList = mappableList;
    }

    public void addToList(Mappable mappable) {

        if (!mappableList.contains(mappable)) {
            mappableList.add(mappable);
        }
    }

    public void renderLayer() {

        for (Mappable m : mappableList) {
            m.render();
        }
    }
}
