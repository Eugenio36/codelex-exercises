package io.codelex.TestAdvanced.Exercise1;

public class DebitCard extends Card {

    private static final int MIN_BALANCE = 100;
    private static final int MAX_BALANCE = 10000;

    public DebitCard(int number, String fullName, String ccv, double balance) {
        super(number, fullName, ccv, balance);
    }

    @Override
    public void addMoney(double amount) {

        setBalance(getBalance() + amount);

        if (getBalance() > MAX_BALANCE) {
            System.out.println("Warning: Too much money");
        }


    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {

        setBalance(getBalance() - amount);

        if (getBalance() < amount) {
            throw new NotEnoughFundsException("Not enough funds on your card!");
        }

        if (getBalance() < MIN_BALANCE) {
            System.out.println("Warning: Low funds");
        }
    }
}
