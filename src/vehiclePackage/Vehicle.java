// Vehicle : This is a Vehicle class with speed attribute. This class has a method speedUp which prints the speed of the vehicle

package vehiclePackage;

public class Vehicle {

	public int speed;

	// Constructor
	
	public Vehicle(int speed) {
		
		this.speed = speed;		
	}

	// Method for speedUp
	
	public void speedUp() {
	
		System.out.println("The speed is " + speed + " mph");		
	}
}
