import java.util.Scanner;

public class housepainting {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the cost per square foot: ");
		int costPerSqFt = in.nextInt();
		
		System.out.print("Please enter the length of the house: ");
		int houseLength = in.nextInt();
		
		System.out.print("Please enter the width of the house: ");
		int houseWidth = in.nextInt();
		
		System.out.print("Please enter the height of the house: ");
		int houseHeight = in.nextInt();
		
		System.out.print("Please enter the number of windows: ");
		int numWindows = in.nextInt();
		
		System.out.print("Please enter the length of a window: ");
		int windowLength = in.nextInt();
		
		System.out.print("Please enter the width of a window: ");
		int windowWidth = in.nextInt();
		
		System.out.print("Please enter the number of doors: ");
		int numDoors = in.nextInt();
		
		System.out.print("Please enter the length of a door: ");
		int doorLength = in.nextInt();
		
		System.out.print("Please enter the width of a door: ");
		int doorWidth = in.nextInt();
		
		int windowSqFt = windowLength*windowWidth;
		
		int doorSqFt = doorLength*doorWidth;
		
		int totalSqFtNoPeak = (houseLength*houseWidth)*2;
		
		int totalSqFtPeak = ((houseLength*houseWidth)+((houseLength*(houseHeight-houseWidth))/2))*2;
		
		int totalSqFtToPaint = ((totalSqFtNoPeak+totalSqFtPeak)-((windowSqFt*numWindows)+(doorSqFt*numDoors)));
	
		int totalCostToPaint = costPerSqFt*totalSqFtToPaint;
		
		System.out.print("\n");
		System.out.print("Your total paintable area is ");
		System.out.print(totalSqFtToPaint);
		System.out.println(" square feet.");
		
		System.out.print("Your estimate is ");
		System.out.print(totalCostToPaint);
		System.out.print(" dollars.");
		
	}

}