// 1. Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). 
// Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific 
// sound for each animal. 

package firstAnimalPackage;

public class Main {

	public static void main(String[] args) {
		
		// Creating objects for bird and cat
		
		Animal animal = new Animal();
		Bird bird = new Bird();
		Cat cat = new Cat();
		
		// Calling method sound for animal,bird and cat
		
		animal.sound();
		bird.sound();
		cat.sound();
	}
}
