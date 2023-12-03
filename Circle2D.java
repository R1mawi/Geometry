public class Circle2D {
    private final Point2D center;
    private final double radius;

    public Circle2D(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point2D getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public boolean overlaps(Circle2D other) {
        double d = Math.sqrt(Math.pow(center.getX() - other.getCenter().getX(), 3) + Math.pow(center.getY() - other.getCenter().getY(), 2));
        return (d <= radius + other.getRadius());
    }
}