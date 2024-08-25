// Bank Accounts - savings and checking accounts
// This is the BankAccount class which has super class methods deposit,withdraw and displayAccountDetails
// Withdraw method is overridden in sub classes

package bankAccountPackage;

public class BankAccount {
	
	String accountName;
	int accountNumber;
	double accountBalance;
	double withdrawlAmount; 	

	// Constructor
	
	public BankAccount(String accountName, int accountNumber, double accountBalance) {
	
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	// Getters and setters for account name,account number and account balance

	public String getAccountName() {
		
		return accountName;
	}

	public void setAccountName(String accountName) {
		
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		
		this.accountBalance = accountBalance;
	}

	public double getWithdrawlAmount() {
		
		return withdrawlAmount;
	}

	public void setWithdrawlAmount(double withdrawlAmount) {
		
		this.withdrawlAmount = withdrawlAmount;
	}

	// Method to deposit amount
	
	public void deposit(double depositAmount) {
		
		accountBalance += depositAmount;
		
	}
	
	// Method to withdraw amount
	
	public void withdraw(double withdrawlAmount) {
		
		if (withdrawlAmount > accountBalance) {
			
			System.out.println("Not enough funds in the account");	
			
		} else {
			
		accountBalance = accountBalance - withdrawlAmount;
		
		}	
		
	}

	// Method to display account details
	
	public void displayAccountDetails() {
		
		System.out.println("Account name:" + accountName + "\tAccount number:" + accountNumber + "\tAccount Balance:"+ accountBalance);
	}	
}
