package io.codelex.TestAdvanced.Exercise1;

public class Main {
    public static void main(String[] args) throws NotEnoughFundsException {
        CreditCard creditCard = new CreditCard(1234, "Jevgenijs Senderovics", "0.045", 500);
        DebitCard debitCard = new DebitCard(5678, "Boris Britva", "0.149", 200);

        System.out.println(creditCard);
        System.out.println(debitCard);
        System.out.println("-------------------");

        try {
            creditCard.setBalance(200);
            creditCard.takeMoney(250);
        } catch (NotEnoughFundsException e) {
            System.out.println(e);
        }

        try {
            debitCard.setBalance(500);
            debitCard.takeMoney(650);
        } catch (NotEnoughFundsException e) {
            System.out.println(e);
        }


        debitCard.setBalance(9500);
        debitCard.addMoney(1500);
    }
}
