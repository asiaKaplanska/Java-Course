package dev.lpa;

public record Coord(double x, double y) {
    public Coord(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", x, y);
    }
}
