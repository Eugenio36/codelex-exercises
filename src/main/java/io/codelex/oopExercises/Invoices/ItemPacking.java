package io.codelex.oopExercises.Invoices;

public class ItemPacking implements Service {

    static final String name = "Item packing";
    static final double price = 5;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getFullInfo() {
        return getName() + ", " + getPrice() + " EUR";
    }
}
