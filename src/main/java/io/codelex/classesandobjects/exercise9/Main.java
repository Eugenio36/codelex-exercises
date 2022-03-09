package io.codelex.classesandobjects.exercise9;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("(" + p2.getX() + ", " + p2.getY() + ")");
    }

    public static void swapPoints(Point p1, Point p2) {
            int tempX = p1.getX();
            int tempY = p1.getY();
            p1.setX(p2.getX());
            p1.setY(p2.getY());
            p2.setX(tempX);
            p2.setY(tempY);

    }
}
