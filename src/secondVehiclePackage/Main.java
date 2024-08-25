// 11. Write a Java program to create a base class Vehicle with methods 
// startEngine() and stopEngine(). Create two subclasses Car and Motorcycle. 
// Override the startEngine() and stopEngine() methods in each subclass to 
// start and stop the engines differently.

package secondVehiclePackage;

public class Main {

	public static void main(String[] args) {
	
		// Objects for car and motorcycle
		
		Vehicle car = new Car();
		Vehicle motorcycle = new Motorcycle();

		// Calling methods startEngine and stopEngine for car and motorcycle objects
		
		car.startEngine();
		car.stopEngine();
		
		motorcycle.startEngine();
		motorcycle.stopEngine();		
	}
}
