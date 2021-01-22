package exerciseSectionSix.other;

public class Point {

    public static void main(String[] args) {

        Point pnt = new Point(2,6);
        Point point = new Point (5,10);
        System.out.println(pnt.distance(point));
    }

    private int x;
    private int y;

    public Point () {
    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        return Math.sqrt(getX() * getX() + getY() * getY());
    }

    public double distance (int x, int y) {
        return Math.sqrt((getX() - x)*(getX() - x) + (getY() - y)*(getY() - y));
    }

    public double distance (Point point) {
        return Math.sqrt((getX() - point.getX())*(getX() - point.getX()) +
                (getY() - point.getY())*(getY() - point.getY()));
    }
}
