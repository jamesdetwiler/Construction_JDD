
public class Application {

	public static void main(String[] args) {

		//test building, getters and setters PASSED, proved by the displayData method
		Building bldg1 = new Building("ABC Building", "Building Address", 50000, "Business", "B");
		//System.out.println(bldg1.toString()); PASSED
		System.out.println(bldg1.displayData());
		
		//test business, getters and setters PASSED, proved by the displayData method
		Business bus1 = new Business("ABC Store", "Business Address", 5000, "Business", "B");
		bus1.setNumRentableUnits(1);
		//System.out.println(bus1.toString()); PASSED
		System.out.println(bus1.displayData());

		
		//test mall, getters and setters PASSED, proved by the displayData method
		Mall mall1 = new Mall("ABC Mall", "Mall Address", 100000, "Business", "B");
		mall1.setNumRentableUnits(100);
		mall1.setNumRentedUnits(10);
		mall1.setMedianUnitSize(1000);
		mall1.setNumParkingSpots(1000);
		//System.out.println(mall1.toString()); PASSED
		System.out.println(mall1.displayData());
		
		//test residential, getters and setters PASSED, proved by the displayData method
		Residential res1 = new Residential("ABC Residential", "Residential Address", 1000, "Residential", "R-1");
		res1.setNumBedrooms(4);
		res1.setNumBathrooms(2);
		res1.setLaundryRoom(true);
		//System.out.println(res1.toString()); PASSED
		System.out.println(res1.displayData());
		
		//test apartment, getters and setters PASSED, proved by the displayData method
		Apartment apt1 = new Apartment("ABC Apartment", "Apartment Address", 25000, "Residential", "R-1");
		apt1.setNumBedrooms(2);
		apt1.setNumBathrooms(2);
		apt1.setLaundryRoom(true);
		apt1.setNumRentableUnits(25);
		apt1.setAvgUnitSize(1500);
		apt1.setParkingAvailable(true);
		//System.out.println(apt1.toString()); PASSED
		System.out.println(apt1.displayData());
		
		//test singlefamilyhome, getters and setters PASSED, proved by the displayData method
		SingleFamilyHome sfh1 = new SingleFamilyHome("ABC Single Family Home", "Home Address", 3000, "Residential", "R-2");
		sfh1.setNumBedrooms(4);
		sfh1.setNumBathrooms(2);
		sfh1.setLaundryRoom(true);
		sfh1.setGarage(true);
		//System.out.println(sfh1.toString()); PASSED
		System.out.println(sfh1.displayData());
		
	}//end main

}//end class
