package io.codelex.TestAdvanced.Exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {

    private static final int MIN_BALANCE = 100;

    public CreditCard(int number, String fullName, String ccv, BigDecimal balance) {
        super(number, fullName, ccv, balance);
    }

    @Override
    public void addMoney(BigDecimal amount) {
        setBalance(getBalance().add(amount));
    }

    @Override
    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {

        super.takeMoney(amount);

        if (getBalance().compareTo(BigDecimal.valueOf(MIN_BALANCE)) < 0) {
            System.out.println("Warning: Low funds");

        }
    }
}