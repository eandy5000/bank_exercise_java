package com.company;

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

public class Main {

    public static void main(String[] args) {
	    Account joeSmith = new Account("Joe Smith", "joe@fake.com");
	    Account daveJones = new Account("234-90", 100,"Dave Jones", "djones@fake.com");

	    joeSmith.addFunds(5);

//	    daveJones.withdrawFunds(65);
//        daveJones.withdrawFunds(35);
//        daveJones.withdrawFunds(35);
//
//        joeSmith.dollarFormat(joeSmith.getBalance());

        daveJones.addFunds(34);
        daveJones.addFunds(34);
        joeSmith.addFunds(45);
        joeSmith.withdrawFunds(15);


    }
}
