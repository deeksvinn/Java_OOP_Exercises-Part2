// Animal: This is super class Animal for sub classes Lion,Tiger and Panther.
// This class has methods eat and sound which are overridden in sub classes.
// This class has a method displayBothActions() which calls both eat and sound methods to display.

package thirdAnimalPackage;

public class Animal {

	// Super class method eat()
	
	public void eat() {
			
		System.out.println("The animals eat raw.");
	}
		
	// Super class method sound()
		
	public void sound() {
			
		System.out.println("The animals make sounds.");
	}
	
	//  Method to display both actions - move and makeSound of animals
	
	public void displayBothActions() {
		
		eat();
		
		sound();
		
		System.out.println("\n");
	}
}
