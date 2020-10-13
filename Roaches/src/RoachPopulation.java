public class RoachPopulation {
	
	/**
		the number of Roaches in a population
	 */
	private double roachPop;
	
	/**
		the Roach population multiplier for breeding
	 */
	private double popMultiplier = 2;
	
	/**
		the percentage of bug killer spray being used
	 */
	private double sprayPercent;
	
	/**
		the Roach population after being sprayed with deadly bug killer
	 */
	private double roachPopAfterSpray;
	
	/**
		keeps track of Roach breeding cycles
	 */
	private int breedCycle = 0;
	
	/**
		Constructs a new Roach population
		@param numRoaches accepts the number of Roaches in a population
	 */
	public void newRoaches(double numRoaches) {
		roachPop = numRoaches;
		System.out.println("The initial Roach population is " + (int)roachPop + ".");
	}
	
	/**
		simulates the Roach population breeding
	 */
	public void breed() {
		//update value for Roach population after being sprayed
		if(breedCycle > 0) {
			roachPop = roachPopAfterSpray;
		}
		
		//increment breed cycle
		breedCycle ++;
		
		//increase Roach population by given breeding multiplier
		roachPop *= popMultiplier;
	}
	
	/**
		simulates spraying the Roach population with a deadly bug killer
		@param sprayAmount accepts the strength of the bug killer spray as a percent 0-100
		@return the accepted spray amount
	 */
	public double spray(double sprayAmount) {
		//pass argument to variable
		sprayPercent = sprayAmount;
		
		//reduce Roach population by given percent and round up if necessary
		roachPopAfterSpray = Math.ceil(roachPop*(1.0-sprayPercent/100.0));
		
		return sprayAmount;
	}
	
	/**
		gets and prints the number of Roaches after breeding and spraying
	 */
	public void getRoaches() {
		//print Roach population after breeding, without decimals for readability
		System.out.println("Roach population after cycle " + breedCycle + " of breeding is " + (int)roachPop + ".");
		
		//print Roach population after breeding and then being sprayed by bug killer, without decimals for readability
		System.out.println("Roach population after cycle " + breedCycle + " of breeding and spraying " + (int)sprayPercent + "% is " + (int)roachPopAfterSpray + ".");
	}
}
