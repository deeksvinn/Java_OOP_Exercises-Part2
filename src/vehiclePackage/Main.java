// 2. Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle.
// Override the speedUp() method in each subclass to increase the vehicle's speed differently.

package vehiclePackage;

public class Main {

	public static void main(String[] args) {
		
		// Creating objects for car and bicycle
		
		Car car = new Car(20);
		Bicycle bicycle = new Bicycle(10);
		
		// Calling speedUp method on car and bicycle
		
		car.speedUp();
		bicycle.speedUp();
	}
}
