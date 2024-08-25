// Vehicle: This is Car class which is a sub class for Vehicle class. The method from 
// super class speedUp is override in this class to increase the speed of the car.

package vehiclePackage;

public class Car extends Vehicle{

	// Constructor
	
	public Car(int speed) {
		super(speed);
		
	}

	// Override method speedUp to increase the speed of car 4 times
	
	@Override
	public void speedUp() {
		
		speed = speed * 4;
		System.out.println("The vehicle is car");
		super.speedUp();
		
	}
}
