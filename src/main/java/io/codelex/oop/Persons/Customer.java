package io.codelex.oop.Persons;

public class Customer extends Person {
    private String customerId;
    private String purchaseCount;

    public Customer(String firstName, String lastName, String id, int age, String customerId, String purchaseCount) {
        super(firstName, lastName, id, age);
        this.customerId = customerId;
        this.purchaseCount = purchaseCount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(String purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getLastName() + ", " + getCustomerId() + " " + "(" + getPurchaseCount() + " purchases)";
    }
}
