package io.codelex.classesandobjects.exercise8;

public class SavingsAccount {

    private double accountBalance;
    private double annualInterestRate;
    private double lastAmountOfInterestEarned;

    public SavingsAccount(double balance, double interestRate) {
        accountBalance = balance;
        annualInterestRate = interestRate;
    }

    public void withdraw(double withdrawAmount) {

        accountBalance = accountBalance - withdrawAmount;
    }

    public void deposit(double depositAmount) {

        accountBalance = accountBalance + depositAmount;
    }

    public void addInterest() {

        double monthInterestRate = annualInterestRate / 12;

        lastAmountOfInterestEarned = monthInterestRate * accountBalance;

        accountBalance = accountBalance + lastAmountOfInterestEarned;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getAnnualInterestRate() {

        return annualInterestRate;
    }

    public double getLastAmountOfInterestEarned() {

        return lastAmountOfInterestEarned;
    }
}
