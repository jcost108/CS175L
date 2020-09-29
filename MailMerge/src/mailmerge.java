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
		
		//Create mail template
		String line1 = "Dear <firstname> <lastname>,";
		String line2 = "Please confirm that your address is <houseNumber> <street>.";
		String line3 = "Is this address correct? Answer: ";
		
		//Print mail template with replaced values
		System.out.println(line1.replace("<firstname>", firstName).replace("<lastname>", lastName));
		System.out.println(line2.replace("<houseNumber>", houseNumber).replace("<street>", street));
		System.out.print(line3);
		
		//Accept answer
		String yorno = in.nextLine();
		System.out.println("Your answer is " + yorno + ". Thank you.");
	}
}