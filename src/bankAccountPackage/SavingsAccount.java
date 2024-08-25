// Bank Accounts - SavingsAccount class which overrides the method withdraw

package bankAccountPackage;

public class SavingsAccount extends BankAccount {

	// Constructor
	
	public SavingsAccount(String accountName, int accountNumber, double accountBalance) {
		
		super(accountName, accountNumber, accountBalance);
	
	}
	
	// Overriding withdraw method from super class to check if withdrwal amount is greater than 500
	// and deducting the fees 20 if withdrawl is made from savings Account
	
	@ Override
	
	public void withdraw(double withdrawlAmount) {
		

		if (withdrawlAmount > 500) {
			
			System.out.println("The withdrawl limit for savings account is 500");	
			
		} else {
			
		double fees = 20;
		
		super.withdraw(withdrawlAmount);
		
		accountBalance = accountBalance - fees;
		
		System.out.println("The account balance after withdrawl from savings account is " + accountBalance);
		
		}
				
	}
}
