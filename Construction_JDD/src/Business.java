
public class Business extends Building {

	//instance variables
	
	protected int numRentableUnits;
	
	public Business(){
		
		super();
		setNumRentableUnits(0);
			
	}//end empty-argument constructor
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		setNumRentableUnits(numRentableUnits);
		
	}//end preferred constructor
	
	public void draw() {
		
		System.out.println("Drawing code for Business.");
		//unsure about object type, is this "Business" or "<<Object Type>>"
	
	}//end draw

	public String displayData() {
		
		return toString();
		
	}//end displayData
	
	//getters and setters
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	@Override
	public String toString() {
		return "Business [Project Name: " + projectName + ", Address: " + completeAddress + ", Square Feet: "
				+ totalSquareFeet + ", Occupancy Group: " + occupancyGroup + ", Occupancy Subgroup: " + subgroup
				+ ", Number of Rentable Units: " + numRentableUnits + "]";
		
	}//end toString
	
}//end class
