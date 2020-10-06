import java.util.Scanner;

public class BankAccountTester {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Ask user for starting balance
		System.out.print("Please enter the new account's starting balance: ");
		double startingBalance = in.nextDouble();
		
		//Ask user for interest rate
		System.out.print("Please enter the new account's interest percentage: ");
		double interestPct = in.nextDouble();
	
		//Create account myBankAccount with starting balance and interest percentage
		BankAccount myBankAccount = new BankAccount(startingBalance, interestPct);
		System.out.println("A new bank account has been created with a starting balance of " + myBankAccount.getBalance() + " and an interest percentage of " + myBankAccount.getInterestPct() + ".");
		
		//Ask user for amount to deposit into myBankAccount and deposit that amount
		System.out.print("\nPlease enter an amount to deposit into the account: ");
		double depositAmount = in.nextDouble();
		myBankAccount.deposit(depositAmount);
		System.out.println(depositAmount + " has been deposited into the account.");
				
		//Ask user for amount to withdraw from myBankAccount and withdraw that amount
		System.out.print("\nPlease enter an amount to withdraw from the account: ");
		double withdrawAmount = in.nextDouble();
		myBankAccount.withdraw(withdrawAmount);
		
		//Calculate the interest as a product of the balance and interest percentage.
		double interest = myBankAccount.getBalance()*myBankAccount.getInterestPct();
		
		//Get and print the new balance in myBankAccount
		System.out.println("\nThe new balance of this account is " + myBankAccount.getBalance() + ".");
	
		//Get and print the interest
		System.out.println("The interest of this account is " + interest + ".");
		
		in.close();
	}
}