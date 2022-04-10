package io.codelex.oop.Shapes;

public class Qube extends ThreeDShape {

    private double width;

    public Qube(double width) {
        super(6);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return getNumSides() * Math.pow(getWidth(), 2);
    }

    @Override
    public double getPerimeter() {
        return 12 * getWidth();
    }

    @Override
    public double calculateVolume() {
        return Math.pow(getWidth(), 3);
    }
}
