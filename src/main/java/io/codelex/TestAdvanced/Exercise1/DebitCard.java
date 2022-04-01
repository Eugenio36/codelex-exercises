package io.codelex.TestAdvanced.Exercise1;

public class DebitCard extends Card {

    private static final int MAX_BALANCE = 10000;

    public DebitCard(int number, String fullName, double ccv, double balance) {
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

        try {
            setBalance(getBalance() - amount);
        } catch (ArithmeticException e) {
            throw new NotEnoughFundsException("Not enough funds");
        }
    }

}
