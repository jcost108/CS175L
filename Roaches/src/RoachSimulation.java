public class RoachSimulation {

	public static void main(String[] args) {
		
		//create object called bugs
		RoachPopulation bugs = new RoachPopulation();
		
		//construct new Roach population with 10 Roaches
		bugs.newRoaches(10);
		
		//breed Roaches to double population
		bugs.breed();
		
		//spray Roaches to reduce population by a given percentage
		bugs.spray(50);
		
		//print number of Roaches before and after spraying
		bugs.getRoaches();
		
		//do another cycle with a larger percentage
		bugs.breed();
		bugs.spray(60);
		bugs.getRoaches();
		
		//repeat two more times with even larger percentages
		bugs.breed();
		bugs.spray(70);
		bugs.getRoaches();
		
		bugs.breed();
		bugs.spray(80);
		bugs.getRoaches();
	}
}
