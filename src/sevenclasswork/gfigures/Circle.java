package sevenclasswork.gfigures;

public class Circle implements GeometricFigure {
    private final double PI =  3.14; //3.14159265359
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }
}
