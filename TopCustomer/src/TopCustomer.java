
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TopCustomer {
	
	Scanner in = new Scanner(System.in);
	
	//create arrays
	ArrayList<Double> prices = new ArrayList<Double>();
	ArrayList<String> names= new ArrayList<String>();
	
	//initialize variable for highest price
	double highestPrice = 0.0;
	
	//method for inputting prices and names
	public void input() {
		
		System.out.println("Input 0 when finished adding prices and names.");
		
		boolean loop = true;
		
		while (loop == true) {
			
			//input a price
			System.out.print("Enter a price: ");
			double nextPrice = in.nextDouble();
			
			//if 0, end loop, otherwise add price to array
			if (nextPrice <= 0) {
				loop = false;
				break;
			} else {
				prices.add(nextPrice);
			}
			
			//input a name
			System.out.print("Enter name of customer who spent that money: ");
			String nextCustomer = in.nextLine();
			nextCustomer = in.nextLine();
			
			//add name to array
			names.add(nextCustomer);
		}
	}
	
	//method to get name of best customer
	public String getNameOfBestCustomer() {
		
		//use collections class to find highest value in prices array list
		highestPrice = Collections.max(prices);
		
		String bestCustomer = "Placeholder Name";
		
		//loop searches through prices array for highest price
		//then gets and saves the corresponding name
		for (int i = 1; i < prices.size(); i++) {
		     if (prices.get(i) == highestPrice) {
		      bestCustomer = names.get(i);
		     }
		}
		return bestCustomer;
	}
	
	//method to get highest price
	public double getHighestPrice() {
		return highestPrice;
	}
	
	public static void main(String[] args) {
		
		TopCustomer top = new TopCustomer();
		
		top.input();
		
		System.out.println("\nOur best customer is "  + top.getNameOfBestCustomer() + ".");
		System.out.println("They spent $" + top.getHighestPrice() + " this month. Thank you!");
	}
}
