package io.codelex.oopExercises.Invoices;

public class ElectronicsItem extends AbstractItem {

    private int power;

    public ElectronicsItem(String name, int price, int power) {
        super(name, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }


    @Override
    public String getFullInfo() {
        return getName() + ", " + getPrice() + " EUR, power: " + getPower() + "W";
    }
}
