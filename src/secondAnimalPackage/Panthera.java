// Animal: This is subclass Panthera which overrides the methods move() and makeSound() for a panthera.
// The methods move and makeSound are overridden in this class.

package secondAnimalPackage;

public class Panthera extends Animal {

	// Overriding the super class method move()
	
	@ Override
	
	public void move() {
		
		System.out.println("The panthera runs very fast.");
	}
	
	// Overriding the super class method makeSound()
	
	@ Override
	
	public void makeSound() {
		
		System.out.println("The panthera roars.");		
	}
}
