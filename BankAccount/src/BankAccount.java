/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount {
	
	
	/**
	   the current balance of the bank account
	 */
	private double balance;
	
	
	
	/**
	   the interest percentage of the bank account
	 */
	private double interestPct;
	
	
	/**
      Constructs a bank account with a given starting balance and interest percentage.
      @param amount the starting balance of the bank account
    */
	public BankAccount(double amount, double intrPct) {
		balance = amount;
		interestPct = intrPct;
	}

   
	/**
      Makes a deposit into this bank account.
      @param amount the amount of the deposit into the bank account
    */
	public void deposit(double amount) {
		balance += amount;
	}

   
   /**
      Makes a withdrawal from this bank account, or displays a message if
      sufficient funds are not available.
      @param amount the amount of the withdrawal from the bank account
    */
	public void withdraw(double amount) {
		if (amount < balance) {
		balance -= amount;
		System.out.println(amount + " has been deducted from the account.");
		} else {
			System.out.println("Insufficient funds to support withdrawal.");
		}
	}
   
   
	/**
      Gets the current balance of this bank account.
	 */
	public double getBalance() {
		return balance;
	}
	
	
	/**
	  Gets the interest percentage.
	 */
	public double getInterestPct() {
		return interestPct;
	}
}