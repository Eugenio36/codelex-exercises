package io.codelex.oopExercises.Invoices;

import java.time.LocalDate;

public class FoodItem extends AbstractItem {

    private LocalDate bestBeforeDate;

    public FoodItem(String name, double price, String bestBeforeDate) {
        super(name, price);
        this.bestBeforeDate = LocalDate.parse(bestBeforeDate);
    }

    public LocalDate getBestBeforeDate() {
        return bestBeforeDate;
    }

    @Override
    public String getFullInfo() {
        return getName() + ", " + getPrice() + " EUR, best before: " + bestBeforeDate;
    }

}
