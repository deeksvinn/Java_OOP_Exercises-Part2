// This is sub class Panther which overrides the super class methods eat and sound

package thirdAnimalPackage;

public class Panther extends Animal {
	
	// Overriding super class method eat()
	
	@ Override	

	public void eat() {
				
		System.out.println("The panther eats small animals.");
	}
				
	// Overriding super class method sound()
			
	@ Override
			
	public void sound() {
					
		System.out.println("The panther purrs.");
	}
}
