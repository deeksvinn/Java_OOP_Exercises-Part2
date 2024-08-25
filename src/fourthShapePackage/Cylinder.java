// This Cylinder class is part of 12th program for Circle and Cylinder
// Package name : fourthShapePackage.
// Uses Shape class from thirdShapePackage for code reusability and 
// methods calculateArea() and draw() are overridden in this Cylinder class

package fourthShapePackage;
import thirdShapePackage.Shape;

public class Cylinder extends Shape {
	
	double radius;
	double height;
	double area;

	// Constructor
	
	public Cylinder(double radius,double height) {
		
		this.radius = radius;
		this.height = height;	
	}


	// Overriding calculateArea() method for cylinder
	
	@ Override
	
	public void calculateArea() {
		
		super.calculateArea();
		
		area = (2 * Math.PI * radius * radius ) + (2 * Math.PI * radius * height);
		
		System.out.println("Cylinder is " + area);
	}
	

	// Overriding the draw method for cylinder
	
	@ Override
	
	public void draw() {
		
		thirdShapePackage.Shape shapeFromThirdShapePackage = new thirdShapePackage.Shape(); 
		
		shapeFromThirdShapePackage.draw();
		
		System.out.println("This method draws a Cylinder");
	}
}


