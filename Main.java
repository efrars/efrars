/*
 * Author: Efrain Rodriguez
 * Date: 09/17/2021
 * Assignment I: Banking Application
 * COP 3337
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
	    // static method that will compiled the super class and subclasses from the Account in the main
		initialize();	
		
		
			
	}
	//  added an static method that will provide to the user options of the banking application
	// it will also call itself in order to repeat the program if needed
	public static void initialize() {
		
	    Scanner keyboard = new Scanner(System.in);
		
		// greetings and application explanation
		System.out.println("\nWelcome to SunRise -- Financial (MOBILE BANKING)\n");
		System.out.println("Anytime you perform a transaction on your checking accounts there will be a fee of 2.00$.\nSavings account has an interest rate of 6%.");
		System.out.println("\nWould you like to create a checking account or savings account?\nEnter 'C' for checking or 'S' for savings:");
		
		String menu = keyboard.next();
	
		if(menu.equalsIgnoreCase("c"))
		{
			System.out.println("How much you would you like to add to your initial balance:");
			
			double balance = keyboard.nextDouble();
			
			CheckingAccount cc = new CheckingAccount(balance);
			
			System.out.println("Would you like to deposit or withdraw from your new account? \nEnter: \n1 for deposit || 2 for withdraw");
			
			int option = keyboard.nextInt();
			
				if(option == 1) 
				{
					System.out.println("Enter an amount to deposit:");
					double amount = keyboard.nextDouble();
					cc.deposit(amount);
					System.out.println("Actual balance: " + cc.balance + "$");
					
				}else if(option == 2) 
				{
					System.out.println("Enter an amount to withdraw:");
					double amount = keyboard.nextDouble();
					cc.withdraw(amount);
					System.out.println("Actual balance: " + cc.balance + "$");
					
				}else 
				{
					System.out.println("Wrong option");
				}
				
				System.out.println("Would you like to go back to the main menu? Enter yes or no");
				String mainMenu = keyboard.next();
				
				if(mainMenu.equalsIgnoreCase("yes")) 
				{
					initialize();
				}else 
				{
					System.out.println("\nThank you for using SunRise -- Financial");
				}	
		}
		
		if(menu.equalsIgnoreCase("s")) 
		{
			
			System.out.println("Enter an amount:");
			
			double balance = keyboard.nextDouble();
			
			SavingsAccount savings = new SavingsAccount(balance);
			
			System.out.println("Enter 1 for deposit || 2 for withdrawn");
			
			int option = keyboard.nextInt();
			
			if(option == 1) 
			{
				
				System.out.println("Enter an amount to deposit:");
				double amount = keyboard.nextDouble();
				savings.deposit(amount);
				System.out.println("Actual balance : " + savings.getInterestRate() + "$");
				
			}else if(option == 2) 
			{
				System.out.println("Enter an amount to withdraw:");
				double amount = keyboard.nextDouble();
				savings.withdraw(amount);
				System.out.println("Actual balance: " + savings.getInterestRate() + "$");
				
			}else 
			{
				System.out.println("Wrong option");
			}
			
			System.out.println("\nWould you like to go back to the main menu? Enter yes or no");
			
			String mainMenu = keyboard.next();
			
			if(mainMenu.equalsIgnoreCase("yes")) 
			{
				initialize();
			}else
			{
				System.out.println("\nThank you for using SunRise -- Financial");
				keyboard.close();
			}
			
		}
		
		
	}
}