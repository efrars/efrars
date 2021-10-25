/* Author: Efrain Rodriguez
 * Date: 09/17/2021
 * Assignment I: Banking Application
 * COP 3337
 */

// child class extends the parent class
public class SavingsAccount extends Account {
	
	// the instance variable of interestRate
	private double interestRate;
	
	// no argument constructor will call the super constructor with no argument
	public SavingsAccount() {
		
		super();
		
	}
	
	// overloaded the SavingsAccount constructor that will take a parameter and also call the super constructor
	// that has a parameter double that will be passed from the user in the main class
	public SavingsAccount(double balance) {
		
		super(balance);
		
		// interest rate is 6%.
		this.interestRate = 0.06;

	}
	
	// will get the interest rate of the SavingsAccount balance 
	public double getInterestRate() {
		
		double total = interestRate * balance;
	
		return total + balance;
		
	}
	
}