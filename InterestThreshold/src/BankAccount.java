
import java.util.Scanner;

/**
   A bank account has a balance and mechanisms for
   depositing, withdrawing, and comparing monthly 
   interest gains to a given threshold.
*/
public class BankAccount {
	
	/**
	   The current balance of the bank account.
	 */
	private double balance;
	
	/**
	   The interest percentage of the bank account.
	 */
	private double interestPct;
			
	/**
      Constructs a bank account.
      Inputs a starting balance and interest percentage.
    */
	public BankAccount(double startingBalance, double intrPct) {
		
		balance = startingBalance;
		interestPct = intrPct;
		
		System.out.println("A new bank account has been created with a starting balance of $" + balance + " and an interest percentage of " + interestPct*100 + "%.");
	}

	/**
      Makes a deposit into this bank account.
      @param amount the amount to be deposited into the bank account
    */
	public void deposit(double amount) {
		balance += amount;
	}

   /**
      Makes a withdrawal from this bank account, or displays a message if
      sufficient funds are not available.
      @param amount the amount to be withdrawn from the bank account
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
	   Computes the number of months needed to reach a threshold.
	*/
	public void calcThreshold() {
		
		Scanner in = new Scanner(System.in);
		
		//copies the account balance into a temporary variable for computations
		double tempBalance = balance;
		
		//variable for incrementing
		int months = 0;
		
		//initial threshold
		double threshold = 0.0;
		
		//boolean for ending the loop
		boolean check = false;
		
		/**
		   while loop inputs threshold
		 */
		while (check == false) {
			
			System.out.print("\nPlease enter a threshold: ");
			threshold = in.nextDouble();

			/**
			   nested while loop contains the computations
			 */
			while (tempBalance < threshold) {
	
				//computes this month's gains by multiplying balance and interest percentage
				//then adds those gains to the balance and increments counter
				double monthInterest = tempBalance*interestPct;
				tempBalance += monthInterest;
				months ++;
				
				//prints result once the threshold has been reached
				if (tempBalance >= threshold) {
					System.out.println("\nIt will take " + months + " months to reach $" + threshold + ".");
				}
				
				/**
				   asks user if they want to stop once the threshold has been reached
				 */
				if (tempBalance >= threshold) {
					System.out.println("\nEnter \"End\" to stop computing thresholds.");
					System.out.println("Enter anything else to compute another threshold.");
					System.out.print("Answer: ");
					String answer = in.next();
					
					//if they input "End", the loop ends
					//if anything else is input, the variables are reset and the loop starts fresh
					if (answer.equalsIgnoreCase("End")) {
						check = true;
						return;
					} else {
						//resets variables for new computation
						months = 0;
						tempBalance = balance;
						break;
					}
				}
			}
			
			if (check == true) {
				break;
			}
		}
		in.close();
	}
	
	/**
      @return current balance of the bank account
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	  @return interest percentage
	 */
	public double getInterestPct() {
		return interestPct;
	}
}
