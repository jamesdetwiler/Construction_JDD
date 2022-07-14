
public class Apartment extends Residential{

	//instance variables
	
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() {
		
		super();
		setNumRentableUnits(0);
		setAvgUnitSize(0);
		setParkingAvailable(false);
		
	}//end empty-argument constructor
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		setNumRentableUnits(numRentableUnits);
		setAvgUnitSize(avgUnitSize);
		setParkingAvailable(parkingAvailable);
		
	}//end preferred constructor
	
	public void draw() {
		
		System.out.println("Drawing code for Apartment.");
		//unsure about object type, is this "Apartment" or "<<Object Type>>"
	
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

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

	@Override
	public String toString() {
		return "Apartment [Project Name: " + projectName + ", Address: " + completeAddress + ", Square Feet: "
				+ totalSquareFeet + ", Occupancy Group: " + occupancyGroup + ", Occupancy Subgroup: " + subgroup +
				", Number of Bedrooms: " + numBedrooms + ", Number of Bathrooms: " + numBathrooms + 
				", Laundry Room: " + laundryRoom + ", Number of Rentable Units: " + numRentableUnits + 
				", Average Unit Size: " + avgUnitSize + ", Parking Available: " + parkingAvailable + "]";
	}//end toString
	
}//end class
