package io.codelex.oopExercises.Invoices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {

    private static final double VAT = 0.21;

    protected List<SellableThing> listOfItems;

    public Order() {
        this.listOfItems = new ArrayList<>();
    }

    public void addItem(SellableThing item) {
        try {
            listOfItems.add(item);

            if (item instanceof FoodItem) {
                if (Objects.equals(((FoodItem) item).getBestBeforeDate(), LocalDate.now())) {
                    throw new BadFoodException();
                }
            }
        } catch (BadFoodException e) {
            System.out.println("Bad food!");
        }
    }

    public List<SellableThing> getListOfItems() {
        return listOfItems;
    }

    public double sumOfItems() {
        return listOfItems.stream().map(SellableThing::getPrice).reduce((double) 0, Double::sum);
    }

    public double vatValue() {
        return sumOfItems() * VAT;
    }

    public double totalValue() {
        return sumOfItems() + vatValue();
    }

    public void display() {
        int count = 1;
        for (SellableThing item : listOfItems) {
            System.out.println("= " + count + ". " + item.getFullInfo());
            count++;
        }
    }


}
