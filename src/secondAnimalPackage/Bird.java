// Animal: This is subclass Bird which overrides the super class methods move and makeSound for a bird.
// The makeSound() method gets the data from the method sound() in Bird class which already exists in another package with name firstAnimalPackage.

package secondAnimalPackage;

public class Bird extends Animal {

	// Overriding the super class method move()
	
	@ Override
	
	public void move() {
		
		System.out.println("The bird flies.");
	}
	
	// Overriding the super class method makeSound()
	
	@ Override
	
	public void makeSound() {
		
		firstAnimalPackage.Bird birdFirstAnimalPackage = new firstAnimalPackage.Bird();
		
		birdFirstAnimalPackage.sound();
	}
}
