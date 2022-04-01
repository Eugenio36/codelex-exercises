package io.codelex.oopExercises.Invoices;

public abstract class AbstractItem implements Item {

    private String name;
    private double price;

    public AbstractItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getFullInfo() {
        return name + ": " + price;
    }
}
