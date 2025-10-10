package uestc.glimmerjava6.polymorphism1;

public class Rectangle extends Shape{
    private static final String INVALID_PARAMETER = "边长必须大于0";
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(INVALID_PARAMETER);
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
