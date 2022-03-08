package io.codelex.classesandobjects.exercise8;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much money is in the account?: ");
        double startingBalance = scanner.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("How long has the account been opened? (months) ");
        double months = scanner.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(startingBalance, annualInterestRate);

        double monthlyDeposit;
        double totalDeposits = 0;
        double monthlyWithdrawal;
        double totalWithdrawal = 0;
        double interestEarned = 0;


        for (int i = 1; i <= months; i++) {
            System.out.println("Enter amount deposited for month: " + i + ": ");
                monthlyDeposit = scanner.nextDouble();
                totalDeposits = totalDeposits + monthlyDeposit;

                savingsAccount.deposit(monthlyDeposit);

            System.out.println("Enter amount withdrawn for " + i + ": ");
                monthlyWithdrawal = scanner.nextDouble();
                totalWithdrawal = totalWithdrawal + monthlyWithdrawal;

                savingsAccount.withdraw(monthlyWithdrawal);

                savingsAccount.addInterest();

                interestEarned = interestEarned + savingsAccount.getLastAmountOfInterestEarned();

        }

        String totalDepositsFormatted = currencyWithChosenLocalisation(totalDeposits, new Locale("en", "US"));
        String totalWithdrawalFormatted = currencyWithChosenLocalisation(totalWithdrawal, new Locale("en", "US"));
        String interestEarnedFormatted = currencyWithChosenLocalisation(interestEarned, new Locale("en", "US"));
        String accountBalanceFormatted = currencyWithChosenLocalisation(savingsAccount.getAccountBalance(), new Locale("en", "US"));

        System.out.println("Total deposited: " + totalDepositsFormatted);
        System.out.println("Total withdrawn: " + totalWithdrawalFormatted);
        System.out.println("Interest earned: " + interestEarnedFormatted);
        System.out.println("Ending balance: " + accountBalanceFormatted);

    }

    public static String currencyWithChosenLocalisation(double value, Locale locale) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(value);
    }
}
