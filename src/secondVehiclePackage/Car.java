// Vehicle: This is sub class Car which overrides the abstract methods from super class

package secondVehiclePackage;

public class Car extends Vehicle {
	
	// Overrides abstract method startEngine() from super class Vehicle
	
	@ Override
	
	public void startEngine() {
		
		System.out.println("Car starts with a press of button.");
	}
	
	// Overrides abstract method stopEngine() from super class Vehicle
	
	@ Override
	
	public void stopEngine() {
		
		System.out.println("Car stops with a press of button.");
	}
}
