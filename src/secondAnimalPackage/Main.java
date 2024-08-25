// 7. Write a Java program to create a base class Animal with methods move() and makeSound().
// Create two subclasses Bird and Panthera. Override the move() method in each subclass 
// to describe how each animal moves. Also, override the makeSound() method in each subclass
// to make a specific sound for each animal.

package secondAnimalPackage;

public class Main {

	public static void main(String[] args) {
		
		// Creating objects for animal,bird and panthera
		
		Animal animal = new Animal();
		
		Bird bird = new Bird();
		
		Panthera panthera = new Panthera();
		
		// Calling method displayBothActions to show sound and move details of animals,bird and panthera
		
		animal.displayBothActions();
		
		bird.displayBothActions();
		
		panthera.displayBothActions();
	}
}
