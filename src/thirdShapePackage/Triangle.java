// This Triangle class is part of 8th program for Circle,Square and Triangle.
// Package name: thirdShapePackage
// This is sub class for the super class "Shape"
// Overrides the calculateArea method from Triangle class in firstShapePackage
// The draw() method from this package is overridden in this Triangle class

package thirdShapePackage;

public class Triangle extends Shape {
 
	// Overriding calculateArea() method with base and height values as 2.0 and 3.0
	
	@Override
	
	public void calculateArea() {
		
		firstShapePackage.Triangle triangleFromFirstShapePackage = new firstShapePackage.Triangle(2.0,3.0);
		
		triangleFromFirstShapePackage.calculateArea(); 
	}
	
	// Overriding draw() method
	
	@ Override
	
	public void draw() {
		
		System.out.println("This method draws a Triangle");
	}
}
