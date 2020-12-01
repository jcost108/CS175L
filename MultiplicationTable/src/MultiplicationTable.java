
public class MultiplicationTable {
	
	public void multiply() {
		
		//variable for calculations
		int value = 0;
		
		//outer loop increments value and moves to new line after current row is done
		for (int i = 1; i <= 10; i++) {
			
			value += 1;
			
			//nested loop calculates and prints products
			for (int j = 1; j <= 10; j++) {
				
				int product = value*j;
				
				//if statement aligns products
				if (product < 10) {
					
					System.out.print("  ");
				
				} else if (product < 100) {
					
					System.out.print(" ");
					
				}
				
				System.out.print(product + " ");
			}
			
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		
		MultiplicationTable table = new MultiplicationTable();
		
		table.multiply();
	}
}
