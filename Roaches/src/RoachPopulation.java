
public class RoachPopulation {
	
	/**
		Instance variable: the number of Roaches in a population
	 */
	private double roachPop;
	
	/**
		Constructs a new Roach population
		@param numRoaches accepts the number of Roaches in a population
	 */
	public void construct(double numRoaches) {
		roachPop = numRoaches;
	}
	
	/**
		Simulates breeding
	 */
	public void breed() {
		//double Roach population
		roachPop *= 2;
	}
	
	/**
		Simulates spraying
		@param sprayAmount accepts the strength of the spray as a percent 0-100
	 */
	public void spray(double sprayAmount) {
		//reduce Roach population by a given percent from 0-100 and round up
		roachPop = Math.ceil(roachPop*(1-(sprayAmount/100)));
	}
	
	/**
		returns the number of Roaches in the population
	 */
	public int getRoaches() {
		return (int)roachPop;
	}
}
