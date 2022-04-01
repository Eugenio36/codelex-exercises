package io.codelex.TestAdvanced.Exercise1;

public class Main {
    public static void main(String[] args) throws NotEnoughFundsException {
        CreditCard creditCard = new CreditCard(1234, "Jevgenijs Senderovics", 0.045, 500);
        DebitCard debitCard = new DebitCard(5678, "Jevgenijs Senderovics", 0.149, 200);

        creditCard.setBalance(100);
        creditCard.takeMoney(50);

        debitCard.setBalance(9_000);
        debitCard.addMoney(1500);
    }
}
