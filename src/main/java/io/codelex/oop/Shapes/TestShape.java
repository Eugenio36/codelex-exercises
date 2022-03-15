package io.codelex.oop.Shapes;

import java.text.DecimalFormat;

public class TestShape {
    public static void main(String[] args) {

        DecimalFormat decimal = new DecimalFormat("0.00");

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Rectangle area: " + decimal.format(rectangle.getArea()));
        System.out.println("Rectangle perimeter: " + decimal.format(rectangle.getPerimeter()));

        System.out.println();

        Triangle triangle = new Triangle(5.4, 2.1);
        System.out.println("Width: " + triangle.getWidth());
        System.out.println("Height: " + triangle.getHeight());
        System.out.println("Triangle area: " + decimal.format(triangle.getArea()));
        System.out.println("Triangle perimeter: " + decimal.format(triangle.getPerimeter()));
    }
}
