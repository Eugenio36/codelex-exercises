package io.codelex.TestAdvanced.Exercise1;

public abstract class Card {
    private int number;
    private String fullName;
    private String ccv;
    private double balance;


    public Card(int number, String fullName, String ccv, double balance) {
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

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void addMoney(double amount);

    public void takeMoney(double amount) throws NotEnoughFundsException {

        if (getBalance() < amount) {
            throw new NotEnoughFundsException("Not enough funds on your card!");
        }

        setBalance(getBalance() - amount);
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", fullName='" + fullName + '\'' +
                ", ccv='" + ccv + '\'' +
                ", balance=" + balance +
                '}';
    }
}
