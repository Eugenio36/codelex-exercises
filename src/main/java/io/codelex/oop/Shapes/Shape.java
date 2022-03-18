package io.codelex.oop.Shapes;

public abstract class Shape {
    private int numSides;

    public Shape(int numSides) {

        this.numSides = numSides;
    }

    public double getNumSides() {

        return numSides;
    }


    public abstract double getArea();

    public abstract double getPerimeter();
}
