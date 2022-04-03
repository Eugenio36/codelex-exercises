package io.codelex.TestAdvanced.Exercise1;

public class CreditCard extends Card {

    private static final int MIN_BALANCE = 100;

    public CreditCard(int number, String fullName, String ccv, double balance) {
        super(number, fullName, ccv, balance);
    }

    @Override
    public void addMoney(double amount) {
        setBalance(getBalance() + amount);

    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {

        if (getBalance() < amount) {
            throw new NotEnoughFundsException("Not enough funds on your card!");
        }

        setBalance(getBalance() - amount);

        if (getBalance() < MIN_BALANCE) {
            System.out.println("Warning: Low funds");

        }
    }
}