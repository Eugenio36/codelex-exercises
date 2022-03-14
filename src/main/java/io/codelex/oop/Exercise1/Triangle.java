package io.codelex.oop.Exercise1;

public class Triangle extends Shape {
    private double width;
    private double height;


    public Triangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return (width * height) / 2;
    }

    public double getPerimeter() {
        return width + height + Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
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
}
