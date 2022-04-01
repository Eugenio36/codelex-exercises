package io.codelex.oopExercises.Invoices;

public class HouseholdItem extends AbstractItem {

    private String color;

    public HouseholdItem(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getFullInfo() {
        return getName() + ", " + getPrice() + " EUR, color " + getColor();
    }
}
