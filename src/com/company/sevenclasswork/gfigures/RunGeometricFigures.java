package com.company.sevenclasswork.gfigures;

public class RunGeometricFigures {
    public static void main(String args[]) {

        //rectangle demo
        Rectangle rectangle1 = new Rectangle(20.4,35);

        System.out.println("rectangle1's perimeter is: " + rectangle1.getPerimeter());
        System.out.println("rectangle1's area is: " + rectangle1.getArea());


        //circle demo
        Circle circle1 = new Circle(3.0);
        System.out.println("circle1's perimeter is: " + circle1.getPerimeter());
        System.out.println("circle1's area is: " + circle1.getArea());


    }
}
