package secondVehiclePackage;

public class Motorcycle extends Vehicle {
	
	// Overrides abstract method startEngine() from super class Vehicle
	
	@ Override
	
	public void startEngine() {
		
		System.out.println("Motorcycle starts when the key is turned clockwise.");
	}
	
	// Overrides abstract method startEngine() from super class Vehicle
	
	@ Override
	
	public void stopEngine() {
		
		System.out.println("Motorcyle stops when the key is turned anticlockwise.");
	}
}
