package uestc.glimmerjava6.polymorphism1;

public class Circle extends Shape {
    private static final String INVALID_PARAMETER = "半径必须大于0";
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException(INVALID_PARAMETER);
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
