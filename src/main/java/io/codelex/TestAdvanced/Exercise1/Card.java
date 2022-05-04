package io.codelex.TestAdvanced.Exercise1;

import java.math.BigDecimal;

public abstract class Card {
    private int number;
    private String fullName;
    private String ccv;
    private BigDecimal balance;


    public Card(int number, String fullName, String ccv, BigDecimal balance) {
        this.number = number;
        this.fullName = fullName;
        this.ccv = ccv;
        this.balance = balance;
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public abstract void addMoney(BigDecimal amount);

    public void takeMoney(BigDecimal amount) throws NotEnoughFundsException {

        if (getBalance().subtract(amount).compareTo(BigDecimal.ZERO) < 0) {
            throw new NotEnoughFundsException("Not enough funds on your card!");
        }

        setBalance(getBalance().subtract(amount));
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
