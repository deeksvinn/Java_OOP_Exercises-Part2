// 12. Write a Java program to create a base class Shape with methods draw() and calculateArea(). 
// Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to draw the respective shape. 
// In addition, override the calculateArea() method in the Cylinder subclass to calculate and return the total surface area of the cylinder.

// Package name : fourthShapePackage. 
// Uses Shape and Circle classes from firstShapePackage for code reusability

package fourthShapePackage;

public class Main {

	public static void main(String[] args) {
	
		// Creating object for Circle class in ThirdShapePackage which has methods calculateArea() and draw() already.
		// Code reusability for Circle class,calculateArea and draw methods
		// Here the value of radius to the circle is 2.0
		
		thirdShapePackage.Circle circleObjThirdShapePackage = new thirdShapePackage.Circle(2.0);
		
		// Calling the calculateArea() and draw() method for circle
		
		circleObjThirdShapePackage.calculateArea(); 
		
		circleObjThirdShapePackage.draw();
		
		// Creating object for Cylinder class which is creared in this package fourthShapePackage
		// Here the values of radius and height for cylinder are 2.0 and 5.0
		
		Cylinder cylinderObjFromFourthShapePackage = new Cylinder(2.0,5.0);
		
		// Calling the calculateArea() and draw() method for cylinder
		
		cylinderObjFromFourthShapePackage.calculateArea();
		
		cylinderObjFromFourthShapePackage.draw();
		
	}
}
