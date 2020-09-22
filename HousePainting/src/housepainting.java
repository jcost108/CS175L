import java.util.Scanner;

public class housepainting {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//accept cost per square foot to paint
		System.out.print("Please enter the cost per square foot: ");
		int costPerSqFt = in.nextInt();
		
		//accept house length
		System.out.print("Please enter the length of the house: ");
		int houseLength = in.nextInt();
		
		//accept house width
		System.out.print("Please enter the width of the house: ");
		int houseWidth = in.nextInt();
		
		//accept house height
		System.out.print("Please enter the height of the house: ");
		int houseHeight = in.nextInt();
		
		//accept number of windows
		System.out.print("Please enter the number of windows: ");
		int numWindows = in.nextInt();
		
		//accept length of a window
		System.out.print("Please enter the length of a window: ");
		int windowLength = in.nextInt();
		
		//accept width of a window
		System.out.print("Please enter the width of a window: ");
		int windowWidth = in.nextInt();
		
		//accept number of doors
		System.out.print("Please enter the number of doors: ");
		int numDoors = in.nextInt();
		
		//accept length of a door
		System.out.print("Please enter the length of a door: ");
		int doorLength = in.nextInt();
		
		//accept width of a door
		System.out.print("Please enter the width of a door: ");
		int doorWidth = in.nextInt();
		
		//compute the square foot of a window
		int windowSqFt = windowLength*windowWidth;
		
		//compute the square foot of a door
		int doorSqFt = doorLength*doorWidth;
		
		//compute the total square feet of the two sides of the house with no peaks
		int totalSqFtNoPeak = (houseLength*houseWidth)*2;
		
		//compute the total square feet of the two sides of the house with peaks
		int totalSqFtPeak = ((houseLength*houseWidth)+((houseLength*(houseHeight-houseWidth))/2))*2;
		
		//calculate the total square feet that can be painted
		//by adding the house sides and subtracting the windows and doors
		int totalSqFtToPaint = ((totalSqFtNoPeak+totalSqFtPeak)-((windowSqFt*numWindows)+(doorSqFt*numDoors)));
	
		//calculate total cost by multiplying cost per square foot by total square feet
		int totalCostToPaint = costPerSqFt*totalSqFtToPaint;
		
		//output total paintable surface area
		System.out.println("\n" + "Your total paintable surface area is " + totalSqFtToPaint + " square feet.");
		
		//out total cost to paint
		System.out.println("Your estimate is " + totalCostToPaint + " dollars.");
		
	}

}