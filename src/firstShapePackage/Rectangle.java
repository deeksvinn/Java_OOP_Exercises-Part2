// This is part of 3rd program
// Package : firstShapePackage
// Shape : This is sub class Rectangle with attributes length and width and calculateArea method
// is override in this class to calculate area of a rectangle

package firstShapePackage;

public class Rectangle extends Shape{
	
	private double length;
	private double width;
	
	// Constructor
	
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
	}
	
	// Ovverride method to calculate area of a triangle
	
	@Override

	public void calculateArea() {
		
		area = length * width;
		
		super.calculateArea();
		
		System.out.println("Rectangle is " +  area);
	}

}
