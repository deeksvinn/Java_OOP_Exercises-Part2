// This Square class is part of 8th program for Circle,Square and Triangle.
// Package name: thirdShapePackage
// This is sub class for the super class "Shape"
// Overrides the calculateArea() and draw() methods from Shape class in this package

package thirdShapePackage;

public class Square extends Shape {
	
	public double side;

	// Constructor
	
	public Square(double side) {
		
		this.side = side;
		
	}
	
	// Overriding calculateArea() method for square
	
	@ Override
	
	public void calculateArea() {
		
		super.calculateArea();
		
		double area = side * side;
		
		System.out.println("Square is " + area );		
	}

	// Overriding draw() method for square
	
	@ Override
	
	public void draw() {
		
		System.out.println("This method draws a Square");
	}
}
