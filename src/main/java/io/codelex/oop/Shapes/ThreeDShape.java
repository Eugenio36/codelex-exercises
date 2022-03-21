package io.codelex.oop.Shapes;

public abstract class ThreeDShape extends Shape {

    public ThreeDShape(int numSides) {
        super(numSides);
    }

    public abstract double calculateVolume();

}
