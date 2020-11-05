
import javax.swing.JOptionPane;

public class RomanNumerals {
	
	/**
	 * inputs year as string and converts to Roman Numerals
	 */
	public void convert() {
		
		//input year as string
		String year = JOptionPane.showInputDialog("Enter year (0001-3999):");
		
		//convert string to array
		String[] yearArray = year.split("");
		
		//convert array to four separate ints
		int digit0 = Integer.parseInt(yearArray[0]);
		int digit1 = Integer.parseInt(yearArray[1]);
		int digit2 = Integer.parseInt(yearArray[2]);
		int digit3 = Integer.parseInt(yearArray[3]);
		
		//convert each digit to Roman Numerals
		
		//thousands place
		if (digit0 == 1) {
			System.out.print("M");
		} else if (digit0 == 2) {
			System.out.print("MM");
		} else if (digit0 == 3) {
			System.out.print("MMM");
		} else {
			System.out.print("Year is not within 0001-3999. Please try again.");
		}
		
		//hundreds place
		if (digit1 == 0 && digit0 <= 3) {
			System.out.print("");
		} else if (digit1 == 1 && digit0 <= 3) {
			System.out.print("C");
		} else if (digit1 == 2 && digit0 <= 3) {
			System.out.print("CC");
		} else if (digit1 == 3 && digit0 <= 3) {
			System.out.print("CCC");
		} else if (digit1 == 4 && digit0 <= 3) {
			System.out.print("CD");
		} else if (digit1 == 5 && digit0 <= 3) {
			System.out.print("D");
		} else if (digit1 == 6 && digit0 <= 3) {
			System.out.print("DC");
		} else if (digit1 == 7 && digit0 <= 3) {
			System.out.print("DCC");
		} else if (digit1 == 8 && digit0 <= 3) {
			System.out.print("DCCC");
		} else if (digit1 == 9 && digit0 <= 3) {
			System.out.print("CM");
		} else {
			System.out.print("");
		}
		
		//tens place
		if (digit2 == 0 && digit0 <= 3) {
			System.out.print("");
		} else if (digit2 == 1 && digit0 <= 3) {
			System.out.print("X");
		} else if (digit2 == 2 && digit0 <= 3) {
			System.out.print("XX");
		} else if (digit2 == 3 && digit0 <= 3) {
			System.out.print("XXX");
		} else if (digit2 == 4 && digit0 <= 3) {
			System.out.print("XL");
		} else if (digit2 == 5 && digit0 <= 3) {
			System.out.print("L");
		} else if (digit2 == 6 && digit0 <= 3) {
			System.out.print("LX");
		} else if (digit2 == 7 && digit0 <= 3) {
			System.out.print("LXX");
		} else if (digit2 == 8 && digit0 <= 3) {
			System.out.print("LXXX");
		} else if (digit2 == 9 && digit0 <= 3) {
			System.out.print("XC");
		} else {
			System.out.print("");
		}
		
		//ones place
		if (digit3 == 0 && digit0 <= 3) {
			System.out.print("");
		} else if (digit3 == 1 && digit0 <= 3) {
			System.out.print("I");
		} else if (digit3 == 2 && digit0 <= 3) {
			System.out.print("II");
		} else if (digit3 == 3 && digit0 <= 3) {
			System.out.print("III");
		} else if (digit3 == 4 && digit0 <= 3) {
			System.out.print("IV");
		} else if (digit3 == 5 && digit0 <= 3) {
			System.out.print("V");
		} else if (digit3 == 6 && digit0 <= 3) {
			System.out.print("VI");
		} else if (digit3 == 7 && digit0 <= 3) {
			System.out.print("VII");
		} else if (digit3 == 8 && digit0 <= 3) {
			System.out.print("VIII");
		} else if (digit3 == 9 && digit0 <= 3) {
			System.out.print("IX");
		} else {
			System.out.print("");
		}
	}
	
	public static void main(String[] args) {
		
		RomanNumerals year = new RomanNumerals();
		
		year.convert();
	}
}
