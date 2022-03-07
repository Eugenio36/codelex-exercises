package io.codelex.classesandobjects.practice;

public class AccountMain {
    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's account",100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland",1_000_000.00);

        System.out.println("Initial state: ");

        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: "+bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: "+bartosSwissAccount.balance());
        System.out.println();

        System.out.println("Final state: ");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);
        System.out.println();

        // Creates an account named "Matt's account" with the balance of 1000
        Account mattsAccount = new Account("Matt's account", 1000);

        //Creates an account named "My account" with the balance of 0
        Account myAccount = new Account("My account", 0);

        //Withdraws 100.0 from Matt's account
        mattsAccount.withdrawal(100);

        //Deposits 100.0 to My account
        myAccount.deposit(100);

        //Prints both accounts
        System.out.println("Matt`s account balance: " + mattsAccount.balance());
        System.out.println("My account balance: " + myAccount.balance());
        System.out.println();

        Account A = new Account("A account", 100);
        Account B = new Account("B account", 0);
        Account C = new Account("C account", 0);

        Account.transfer(A, B, 50);
        Account.transfer(B, C, 25);

        System.out.println("A account balance: " + A.balance()); // 50
        System.out.println("B account balance: " + B.balance()); // 25
        System.out.println("C account balance: " + C.balance()); // 25

    }
}
