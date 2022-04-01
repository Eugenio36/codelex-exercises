package io.codelex.TestAdvanced.Exercise1;

public class CreditCard extends Card {

    public CreditCard(int number, String fullName, double ccv, double balance) {
        super(number, fullName, ccv, balance);
    }

    @Override
    public double addMoney() {
        return 0;
    }

    @Override
    public double takeMoney() {
        if (getBalance() < 100) {
            System.out.println("Warning: Low funds");
        }
        return 0;
    }
}
