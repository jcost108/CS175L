
import java.util.Scanner;

public class CreditCard {
	
	/**
	 * removes dashes and spaces from a string of numbers
	 */
	public void process() {
		
		Scanner in = new Scanner(System.in);
		
		//input credit card number, save as string
		System.out.print("Please enter a credit card number: ");
		String cc = in.nextLine();
		
		//variable for incrementing
		int i = 0;
		
		//dash character for comparison
		String dash = "-";
		char d = dash.charAt(0);
		
		/**
		 * While loop cycles through each character of the credit card number
		 * and checks for dashes or spaces. If it finds one, it removes it.
		 */
		while (i < cc.length()) {
			
			//pick out the next character
			char ch = cc.charAt(i);
			
			if (ch == d || Character.isWhitespace(ch)) {
				
				//cut string into two pieces before and after a given character
				String before = cc.substring(0, i);
				String after = cc.substring(i + 1);
				
				//recombine strings leaving the problem character out
				cc = before + after;
			
			} else {
				//move on to next character 
				i++;
			}
		}
		
		//output result
		System.out.println("\nCard number with dashes removed: " + cc);
		
		in.close();
	}
	
	public static void main(String[] args) {
		
		CreditCard number = new CreditCard();
		
		number.process();
	}
}
