package io.codelex.oop.Shapes;

import java.text.DecimalFormat;

public class TestShape {
    public static void main(String[] args) {

        DecimalFormat decimal = new DecimalFormat("0.00");

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Rectangle:");
        System.out.println("Sides: " + (int) rectangle.getNumSides());
        System.out.println("Width: " + rectangle.getWidth() + " cm");
        System.out.println("Height: " + rectangle.getHeight() + " cm");
        System.out.println("Rectangle area: " + decimal.format(rectangle.getArea()) + " cm");
        System.out.println("Rectangle perimeter: " + decimal.format(rectangle.getPerimeter()) + " cm");

        System.out.println();

        Triangle triangle = new Triangle(5.4, 2.1);
        System.out.println("Triangle:");
        System.out.println("Sides: " + (int) triangle.getNumSides() + " cm");
        System.out.println("Width: " + triangle.getWidth() + " cm");
        System.out.println("Height: " + triangle.getHeight() + " cm");
        System.out.println("Triangle area: " + decimal.format(triangle.getArea()) + " cm");
        System.out.println("Triangle perimeter: " + decimal.format(triangle.getPerimeter()) + " cm");

        System.out.println();

        Hexagon hexagon = new Hexagon(6, 5);
        System.out.println("Hexagon:");
        System.out.println("Sides: " + (int) hexagon.getNumSides());
        System.out.println("Width: " + hexagon.getWidth() + " cm");
        System.out.println("Height: " + hexagon.getHeight() + " cm");
        System.out.println("Hexagon area: " + decimal.format(hexagon.getArea()) + " cm");
        System.out.println("Hexagon perimeter: " + decimal.format(hexagon.getPerimeter()) + " cm");

        System.out.println();

        Cone cone = new Cone(6, 10);
        System.out.println("Cone:");
        System.out.println("Width: " + cone.getWidth() + " cm");
        System.out.println("Height: " + cone.getHeight() + " cm");
        System.out.println("Radius: " + cone.radius() + " cm");
        System.out.println("Side of cone: " + decimal.format(cone.sideOfCone()) + " cm");
        System.out.println("Cone side area: " + decimal.format(cone.getSideArea()) + " cm");
        System.out.println("Cone full area: " + decimal.format(cone.getArea()) + " cm");
        System.out.println("Cone volume: " + decimal.format(cone.calculateVolume()) + " cm");

        System.out.println();

        Qube qube = new Qube(3);

        System.out.println("Qube:");
        System.out.println("Sides: " + (int) qube.getNumSides());
        System.out.println("Width: " + qube.getWidth() + " cm");
        System.out.println("Qube volume: " + qube.calculateVolume() + " cm");
        System.out.println("Qube area: " + qube.getArea() + " cm");
        System.out.println("Qube perimeter: " + qube.getPerimeter() + " cm");


    }
}
