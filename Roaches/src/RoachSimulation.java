
public class RoachSimulation {

	public static void main(String[] args) {
		
		//create object called bugs
		RoachPopulation bugs = new RoachPopulation();
		
		
		//construct new Roach population with 10 Roaches
		bugs.construct(10);
		System.out.println("The initial Roach population is " + bugs.getRoaches() + ".");
		
		
		//breed Roaches to double population
		bugs.breed();
		System.out.println("The Roach population after cycle 1 breeding is " + bugs.getRoaches() + ".");
		
		
		//spray Roaches to reduce population by 50%
		bugs.spray(50);
		System.out.println("The Roach population after cycle 1 and 50% spraying is " + bugs.getRoaches() + ".");
		
	
		//do another cycle with 60% spray
		bugs.breed();
		System.out.println("The Roach population after cycle 2 breeding is " + bugs.getRoaches() + ".");
		bugs.spray(60);
		System.out.println("The Roach population after cycle 2 and 60% spraying is " + bugs.getRoaches() + ".");
		
		
		//repeat two more times with 70% and 80% spray
		bugs.breed();
		System.out.println("The Roach population after cycle 3 breeding is " + bugs.getRoaches() + ".");
		bugs.spray(70);
		System.out.println("The Roach population after cycle 3 and 70% spraying is " + bugs.getRoaches() + ".");
		
		bugs.breed();
		System.out.println("The Roach population after cycle 4 breeding is " + bugs.getRoaches() + ".");
		bugs.spray(80);
		System.out.println("The Roach population after cycle 4 and 80% spraying is " + bugs.getRoaches() + ".");
	}
}
