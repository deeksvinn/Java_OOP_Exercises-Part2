// Animal: This is super class Animal which has methods move,makeSound and displayBothActions

package secondAnimalPackage;

public class Animal {

	// Super class method move()
	
	public void move() {
		
		System.out.println("The animals move fast.");
	}
	
	// Super class method makeSound()
	
	public void makeSound() {
		
		System.out.println("The animals make sounds.");
	}

	//  Method to display both actions - move and makeSound of animals
	
	public void displayBothActions() {
		
		move();
		
		makeSound();
		
		System.out.println("\n");
	}
}
