
public class Mall extends Business{

	//instance variables
	
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpots;
	
	public Mall() {
		
		super();
		setNumRentedUnits(0);
		setMedianUnitSize(0);
		setNumParkingSpots(0);
				
	}//end empty-argument constructor

	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		setNumRentedUnits(numRentedUnits);
		setMedianUnitSize(medianUnitSize);
		setNumParkingSpots(numParkingSpots);
		
	}//end preferred constructor
	
	public void draw() {
		
		System.out.println("Drawing code for Mall.");
		//unsure about object type, is this "Mall" or "<<Object Type>>"
	
	}//end draw

	public String displayData() {
		
		return toString();
		
	}//end displayData
	
	//getters and setters
	
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpots() {
		return numParkingSpots;
	}

	public void setNumParkingSpots(int numParkingSpots) {
		this.numParkingSpots = numParkingSpots;
	}

	@Override
	public String toString() {
		return "Mall [Project Name: " + projectName + ", Address: " + completeAddress + ", Square Feet: "
				+ totalSquareFeet + ", Occupancy Group: " + occupancyGroup + ", Occupancy Subgroup: " + subgroup
				+ ", Number of Rentable Units: " + numRentableUnits + ", Number of Rented Units: " + numRentedUnits +
				", Median Unit Size: " + medianUnitSize + ", Number of Parking Spots: " + numParkingSpots + "]";
	}//end toString
	
}//end class
