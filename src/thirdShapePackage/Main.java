// 8. Write a Java program to create a base class Shape with methods draw() and calculateArea(). 
// Create three subclasses: Circle, Square, and Triangle.Override the draw() method in each subclass
// to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.
// Package: thirdShapePackage

package thirdShapePackage;

public class Main {

	public static void main(String[] args) {
		
		// Creating objects for Shape,Circle,Square and Triangle classes in this package
		// Calling calculateArea() and draw() method over those objects
		
		Shape shapeobjInThisClass = new Shape();
		shapeobjInThisClass.calculateArea();
		
		Circle circleobjInThisClass = new Circle(2.0);
		circleobjInThisClass.calculateArea();
		circleobjInThisClass.draw();
		
		Square squareObjInThisClass = new Square(2.0);
		squareObjInThisClass.calculateArea();
		squareObjInThisClass.draw();
		
		Triangle triangleObjInThisClass = new Triangle();
		triangleObjInThisClass.calculateArea();
		triangleObjInThisClass.draw();

	}
}
