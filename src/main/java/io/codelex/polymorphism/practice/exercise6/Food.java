package io.codelex.polymorphism.practice.exercise6;

public abstract class Food {
    private double quantity;

    public Food(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
