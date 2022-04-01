package io.codelex.TestAdvanced.Exercise1;

public abstract class Card {
    private int number;
    private String fullName;
    private double ccv;
    private double balance;


    public Card(int number, String fullName, double ccv, double balance) {
        this.number = number;
        this.fullName = fullName;
        this.ccv = ccv;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getCcv() {
        return ccv;
    }

    public void setCcv(double ccv) {
        this.ccv = ccv;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void addMoney(double amount);

    public abstract void takeMoney(double amount) throws NotEnoughFundsException;

}
