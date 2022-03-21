package io.codelex.oop.Shapes;

public class Cone extends ThreeDShape {

    private double width;
    private double height;

    public Cone(double width, double height) {
        super(2);
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

    public double radius() {
        return getWidth() / 2;
    }

    public double sideOfCone() {
        return Math.sqrt((Math.pow(radius(), 2) + Math.pow(getHeight(), 2)));
    }

    @Override
    public double calculateVolume() {
        return (Math.PI * Math.pow(radius(), 2) * getHeight()) / 3;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius(), 2) + Math.PI * radius() * sideOfCone();
    }

    public double getSideArea() {
        return Math.PI * radius() * sideOfCone();
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
