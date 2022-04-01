package io.codelex.TestAdvanced.Exercise1;

public class DebitCard extends Card {
    public DebitCard(int number, String fullName, double ccv, double balance) {
        super(number, fullName, ccv, balance);
    }

    @Override
    public double addMoney() {
        if (getBalance() > 10000) {
            System.out.println("Warning: Too much money");
        }
        return 0;
    }

    @Override
    public double takeMoney() {
        return 0;
    }
}
