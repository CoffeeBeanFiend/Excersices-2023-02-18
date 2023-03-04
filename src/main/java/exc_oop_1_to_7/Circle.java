package exc_oop_1_to_7;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
