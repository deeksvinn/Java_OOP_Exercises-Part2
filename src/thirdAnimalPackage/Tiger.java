// // This is sub class Tiger which overrides the super class methods eat and sound

package thirdAnimalPackage;

public class Tiger extends Animal {
	
	// Overriding super class method eat()
	
	@ Override	

	public void eat() {
			
		System.out.println("The tiger eats by hunting.");
	}
			
	// Overriding super class method sound()
		
	@ Override
		
	public void sound() {
				
		System.out.println("The tiger growls.");
	}
}