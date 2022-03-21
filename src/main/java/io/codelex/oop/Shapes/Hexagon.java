package io.codelex.oop.Shapes;

public class Hexagon extends Shape {

    private double width;
    private double height;

    public Hexagon(double width, double height) {
        super(6);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getArea() {
        return ((3 * Math.sqrt(3)) / 2) * Math.pow(getWidth(), 2);
    }

    @Override
    public double getPerimeter() {
        return getNumSides() * getWidth();
    }
}
