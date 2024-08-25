// 9. Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). 
// Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each
// subclass to impose different withdrawal limits and fees.

package bankAccountPackage;

public class Main {

	public static void main(String[] args) {
		
		// Objects for savings account and checking account
		
		BankAccount savingsAccount = new SavingsAccount("Thomas",1234,1000.0);
		BankAccount checkingAccount = new CheckingAccount("Chris",5678,2000.0);
		
		// Calling withdraw method on savingsAccount and checkingAccount
	
		withdrawFromAccount(savingsAccount,600);
		withdrawFromAccount(checkingAccount,200);
		
		// Calling deposit method oon savingsAccount and checkingAccount
		
		savingsAccount.deposit(150);
		checkingAccount.deposit(350);
		
		// Displaying details of account details
		
		savingsAccount.displayAccountDetails();
		checkingAccount.displayAccountDetails();	
	}
	
	// A method which takes any account object and amount and calls the method withdraw on that account
	
	public static void withdrawFromAccount(BankAccount account, double amount) {
	    
	    account.withdraw(amount);	
	} 
}	
