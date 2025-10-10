package uestc.glimmerjava6.polymorphism2;

public class Triangle implements Shape{
    private static final String INVALID_PARAMETER = "不存在以该三边构成的三角形";
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException(INVALID_PARAMETER);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
