package io.codelex.TestAdvanced.Exercise1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws NotEnoughFundsException {
        CreditCard creditCard = new CreditCard(1234, "Jevgenijs Senderovics", "0.045", BigDecimal.valueOf(500));
        DebitCard debitCard = new DebitCard(5678, "Boris Britva", "0.149", BigDecimal.valueOf(200));

        System.out.println(creditCard);
        System.out.println(debitCard);
        System.out.println("-------------------");

        try {
            creditCard.setBalance(BigDecimal.valueOf(200));
            creditCard.takeMoney(BigDecimal.valueOf(250));
        } catch (NotEnoughFundsException e) {
            System.out.println(e);
        }

        try {
            debitCard.setBalance(BigDecimal.valueOf(500));
            debitCard.takeMoney(BigDecimal.valueOf(650));
        } catch (NotEnoughFundsException e) {
            System.out.println(e);
        }


        debitCard.setBalance(BigDecimal.valueOf(9500));
        debitCard.addMoney(BigDecimal.valueOf(1500));
    }
}
