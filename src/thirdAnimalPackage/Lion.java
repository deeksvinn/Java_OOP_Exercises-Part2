// This is sub class Lion which overrides the super class methods eat and sound

package thirdAnimalPackage;

public class Lion extends Animal {
	
	// Overriding super class method eat()
	
	@ Override	

	public void eat() {
		
		System.out.println("The lion eats by hunting other animals.");
	}
		
	// Overriding super class method sound()
	
	@ Override
	
	public void sound() {
			
		System.out.println("The lion roars.");
	}
}
