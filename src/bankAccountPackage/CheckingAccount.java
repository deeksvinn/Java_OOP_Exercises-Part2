// Bank Accounts - CheckingAccount class which overrides the method withdraw

package bankAccountPackage;

public class CheckingAccount extends BankAccount{
	
	// Constructor

	public CheckingAccount(String accountName, int accountNumber, double accountBalance) {
		
		super(accountName, accountNumber, accountBalance);
	
	}

	// Overriding withdraw method from super class to check if withdrwal amount is greater than 300
	// and deducting the fees 50 if withdrawl is made from savings Account
	
	@ Override
	
	public void withdraw(double withdrawlAmount) {

		
		if (withdrawlAmount > 300) {
			
			System.out.println("The withdrawl limit from checking account is 300");	
			
		} else {
			
		double fees = 50;
		
		super.withdraw(withdrawlAmount);
		
		accountBalance = accountBalance - fees;
	
		System.out.println("The account balance after withdrawing " + withdrawlAmount + " from checking account is " + accountBalance);
		
		}				
	}
}
