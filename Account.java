
/*
 * Author: Efrain Rodriguez
 * Date: 09/17/2021
 * Assignment I: Banking Application
 * COP 3337
 */

// Parent class
public class Account {
	
	// instance variable declared public, all the other class need to know the balance passed from the user
	public double balance;
	
	// constructor with no parameters, this balance is initialized to 0.0.
	public Account(){
		
	}

	// overloaded constructor with balance parameter that will be received from the user
	public Account(double balance) 
	{
		
		// conditional statements that will tell the user if balance is 0.0 then is invalid and close the program.
		if(balance > 0) {
			this.balance = balance;
		}else {
			System.out.println("Initial balance is invalid");
			this.balance = 0.0;
			System.exit(0);
		}
		
	}
		
	// boolean method that will print a message if balance is less than the amount to withdrawn.
	// if the balance is not less than the amount then the balance minus the amount
	public boolean withdraw(double amount) {
		if(balance <= amount) {
			System.out.println("Debit amount exceeded account balance.");
			return false;
		}else {
			balance = balance - amount;
			return true;
		}
        
	}
	
	// will not return anything but will take the amount from the user and sum the balance and the amount.
	public void deposit(double amount) {
		
		balance = balance + amount;
	}
	
	// will get the actual balance of the both accounts transactions
	public double getBalance() {
		
	   
	    
		return  balance;
	}

}
