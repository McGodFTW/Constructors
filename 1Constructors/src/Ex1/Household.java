package Ex1;

public class Household {

	int occupants;
	double income;
	
	public Household() {
		
		occupants = 2;
		income = 40000;
		
	}
	
	public void setOccupants(int o) {
		
		occupants = o;
		
	}
	
	public void setIncome(double i) {
		
		income = i;
		
	}
	
	public int getOccupants() {
		
		return occupants;
		
	}
	
	public double getIncome() {
		
		return income;
		
	}
}
