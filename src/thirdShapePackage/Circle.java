// This Circle class is part of 8th program for Circle,Square and Triangle.
// Package name: thirdShapePackage
// This is sub class for the super class "Shape"
// Overrides the calculateArea method from Circle class in firstShapePackage
// The draw() method from this package is overridden in this circle class

package thirdShapePackage;

public class Circle extends Shape {
	
	public double radius;

    // Constructor 
    
    public Circle(double radius) {
    	
        this.radius = radius;
    }

    // Method to calculate area of a circle is used here from firstShapePackage
    
	@ Override
	
	public void calculateArea() {
		
		firstShapePackage.Circle circleFromFirstShapePackage = new firstShapePackage.Circle(2.0);
		
		circleFromFirstShapePackage.calculateArea(); 
	}
	
	// Overriding the draw method from the super class Shape in this thirdShapepackage
	
	@ Override
	
	public void draw() {
		
		System.out.println("This method(from thirdShapePackage - current package) draws a circle");
	}
}
