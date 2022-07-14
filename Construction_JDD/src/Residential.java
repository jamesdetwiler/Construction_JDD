
public class Residential extends Building{

	//instance variables
	
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		
		super();
		setNumBedrooms(0);
		setNumBathrooms(0);
		setLaundryRoom(false);
		
	}//end empty-argument constructor
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		setNumBedrooms(numBedrooms);
		setNumBathrooms(numBathrooms);
		setLaundryRoom(laundryRoom);
		
	}//end preferred constructor

	public void draw() {
		
		System.out.println("Drawing code for Residential.");
		//unsure about object type, is this "Residential" or "<<Object Type>>"
	
	}//end draw

	public String displayData() {
		
		return toString();
		
	}//end displayData
	
	//getters and setters
	
	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}

	@Override
	public String toString() {
		return "Residential [Project Name: " + projectName + ", Address: " + completeAddress + ", Square Feet: "
				+ totalSquareFeet + ", Occupancy Group: " + occupancyGroup + ", Occupancy Subgroup: " + subgroup +
				", Number of Bedrooms: " + numBedrooms + ", Number of Bathrooms: " + numBathrooms + 
				", Laundry Room: " + laundryRoom + "]";
	}//end toString
	
}//end class
