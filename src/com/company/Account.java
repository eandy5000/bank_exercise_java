package com.company;

/**
 * Created by eandreweccleston on 2/8/18.
 */

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class Account {
    String accountNumber = "999-999";
    double balance = 0;
    String customerName;
    String email;

    public Account(String accountNumber, double balance, String customerName, String email) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
    }

    public Account(String customerName, String email) {
        this.customerName = customerName;
        this.email = email;
    }

    private int balanceChecker(int balance, int change) {
        if((balance + change) > 0) {
            this.balance += change;
            return change;
        } else {
            System.out.println("insufficient funds");
            return -1;
        }
    }

    public int addFunds(int deposit) {
        if (deposit <= 0) {
            System.out.println("deposits must be positive");
            return -1;
        }
        this.balance += deposit;
        System.out.printf("$%d.00 added to account, new balance $%.2f \n", deposit, this.balance);
        return deposit;
    }

    public int withdrawFunds(int withdraw) {
        if(withdraw < 0) {
            System.out.println("Error: invalid withdraw format");
            return -1;
        }
        if((this.balance - withdraw) < 0) {
            System.out.println("insufficient funds");
            return -1;
        }
        this.balance -= withdraw;
        System.out.printf("$%d.00 taken from account, new balance $%.2f \n", withdraw, this.balance);
        return withdraw;
    }

//    public void dollarFormat(double inputD) {
//        System.out.printf("$%.2f", inputD);
//    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }
}
