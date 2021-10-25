/*
 * Author: Efrain Rodriguez
 * Date: 09/17/2021
 * Assignment I: Banking Application
 * COP 3337
 */

public class CheckingAccount extends Account {
	
	// the instance variable of transactionFee
	private double transactionFee;
	
	// no argument constructor will call the super constructor with no argument
	public CheckingAccount() {
		
		super();
	}
	
	// overloaded the CheckingAccount constructor that will take a double parameter and also call 
	// the super overloaded constructor of the parent class
	public CheckingAccount(double balance) {
		
		super(balance);

		// initialized transacion fee
		this.transactionFee = 2.00;
	}
	
	// override Account deposit method by calling the method and doing a different operation
	// the balance will be deducted a transaction fee
	public void deposit(double amount) {
		
		super.deposit(amount);
		
		balance = balance - transactionFee;
		
	}
	
	// override Account withdraw method by using conditionals that will verify if the balance is not less than amount
	// if the balance is not less than amout then the balance will be deducted a transaction fee. 
	public boolean withdraw(double amount) {
	     
	        double b = balance;

	        if(super.withdraw(amount) == true) {
	            
	            balance = balance - transactionFee;
	            
	        }if(balance < transactionFee) {
	            
	            System.out.println("Money can't be withdrawn because there is a transaction fee of " + transactionFee + "$");
	            balance = b;
	            return true;
	        }
	           return false;  
	}
	
}
	    
	    
	
	



		    
		    
		
	    
		
	    
	    
	


