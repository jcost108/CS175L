import java.util.Scanner;

public class mailmerge {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Ask user for their first name
		System.out.print("Please enter your first name: ");
		String firstName = in.nextLine();
		
		//Ask user for their last name
		System.out.print("Please enter your last name: ");
		String lastName = in.nextLine();
		
		//Ask user for their house number
		System.out.print("Please enter your house number: ");
		String houseNumber = in.nextLine();
		
		//Ask user for their street address
		System.out.print("Please enter your street: ");
		String street = in.nextLine();
		
		//Merge data into mail template
		System.out.println("\n" + "Dear " + firstName + " " + lastName + ",");
		System.out.println("Please confirm that your address is " + houseNumber + " " + street + ".");
		System.out.print("Is this address correct? Answer: ");
		String yorno = in.nextLine();
		System.out.print("Your answer is " + yorno + ". Thank you.");
		
	}
	
}
