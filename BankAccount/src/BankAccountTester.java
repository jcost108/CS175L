public class BankAccountTester {
	
	public static void main(String[] args) {

		//Create account myBankAccount with starting balance 1000
		double startingBalance = 1000;
		BankAccount myBankAccount = new BankAccount(startingBalance);
		System.out.println("A new bank account called myBankAccount has been created with a starting balance of " + startingBalance + ".");
		
		//Withdraw 500 from myBankAccount
		double withdrawAmount = 500;
		myBankAccount.withdraw(withdrawAmount);
		System.out.println(withdrawAmount + " has been deducted from the account.");
		
		//Deposit 1500 into myBankAccount
		double depositAmount = 1500;
		myBankAccount.deposit(depositAmount);
		System.out.println(depositAmount + " has been deposited into the account.");
		
		//Get and print the balance in myBankAccount
		System.out.println("The current balance of this account is " + myBankAccount.getBalance() + ".");
	}
}