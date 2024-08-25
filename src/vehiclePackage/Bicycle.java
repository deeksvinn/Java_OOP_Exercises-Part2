// Vehicle: This is Bicycle class which is a sub class for Vehicle class. The method from 
// super class speedUp is override in this class to increase the speed of the bicycle.

package vehiclePackage;

public class Bicycle extends Vehicle{

	// Constructor
	
	public Bicycle(int speed) {
		super(speed);
	}
	
	// Override method for speedUp
	
	@Override
	
	public void speedUp() {
		
		speed = speed * 2;
		System.out.println("\nThe vehicle is bicycle");
		super.speedUp();
	}
}
