
public class SingleFamilyHome extends Residential{

	//instance variables
	
	private boolean garage;
	
	public SingleFamilyHome() {
		
		super();
		setGarage(false);
		
	}//end empty-argument constructor
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		setGarage(garage);
		
	}//end preferred constructor

	public void draw() {
		
		System.out.println("Drawing code for SingleFamilyHome.");
		//unsure about object type, is this "SingleFamilyHome" or "<<Object Type>>"
	
	}//end draw

	public String displayData() {
		
		return toString();
		
	}//end displayData
	
	//getters and setters
	
	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	@Override
	public String toString() {
		return "SingleFamilyHome [Project Name: " + projectName + ", Address: " + completeAddress + ", Square Feet: "
				+ totalSquareFeet + ", Occupancy Group: " + occupancyGroup + ", Occupancy Subgroup: " + subgroup +
				", Number of Bedrooms: " + numBedrooms + ", Number of Bathrooms: " + numBathrooms + 
				", Laundry Room: " + laundryRoom + ", Garage: " + garage + "]";
	}//end toString
	
}//end class
