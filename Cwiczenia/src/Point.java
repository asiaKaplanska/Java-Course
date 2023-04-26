public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double a = (double) (getX() * getX()) + (double) (getY() * getY());
        return Math.sqrt(a);
    }

    public double distance(int x, int y) {
        double b = (double) (x - getX()) * (x - getX()) +
                (double) (y - getY()) * (y - getY());
        return Math.sqrt(b);
    }

    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }
}
