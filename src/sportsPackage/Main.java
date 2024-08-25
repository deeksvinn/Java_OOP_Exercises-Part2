// 5. Write a Java program to create a base class Sports with a method called play(). 
// Create three subclasses: Football, Basketball, and Rugby. Override the play()
// method in each subclass to play a specific statement for each sport.

package sportsPackage;

public class Main {

	public static void main(String[] args) {
	
		Sports sports = new Sports();
		
		Football football = new Football();
		
		Basketball basketball = new Basketball();
		
		Rugby rugby = new Rugby();
		
		sports.play();
		football.play();
		basketball.play();
		rugby.play();
	}
}
