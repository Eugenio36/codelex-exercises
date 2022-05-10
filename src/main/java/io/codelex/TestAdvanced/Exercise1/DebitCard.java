package io.codelex.TestAdvanced.Exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {

    private static final int MAX_BALANCE = 10000;

    public DebitCard(int number, String fullName, String ccv, BigDecimal balance) {
        super(number, fullName, ccv, balance);
    }

    @Override
    public void addMoney(BigDecimal amount) {

        setBalance(getBalance().add(amount));

        if (getBalance().compareTo(BigDecimal.valueOf(MAX_BALANCE)) > 0) {
            System.out.println("Warning: Too much money");
        }
    }
}
