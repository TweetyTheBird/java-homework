package sevenclasswork.gfigures;

public class Rectangle implements GeometricFigure {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2*width + 2*length;
    }

    @Override
    public double getArea() {
        return width*length;
    }
}
