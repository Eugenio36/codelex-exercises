package io.codelex.classesandobjects.exercise1;

public class Product {
    String name;
    double price;
    int amount;


    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "[" +
                "name = '" + name + '\'' +
                ", price = " + price +
                ", amount = " + amount +
                ']';
    }
}
