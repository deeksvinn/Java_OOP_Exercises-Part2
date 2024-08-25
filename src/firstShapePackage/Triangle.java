// This is part of 3rd program
// Package : firstShapePackage
// Shape : This is sub class Triangle with attributes base and height and calculateArea method
// is overridden in this class to calculate area of a triangle

package firstShapePackage;

public class Triangle extends Shape{
	
	private double base;
	private double height;

	// Constructor
	
	public Triangle(double base,double height) {
		
		this.base = base;
		this.height = height;	
	}
	
	// Getters and setters for base and height
	
	public double getBase() {
		
		return base;
	}

	public void setBase(double base) {
		
		this.base = base;
	}

	public double getHeight() {
		
		return height;
	}

	public void setHeight(double height) {
		
		this.height = height;
	}

	// Ovverride method to calculate area of a triangle
	
	@Override
	
	public void calculateArea() {
		
		area = ((base * height)/2);
		
		super.calculateArea();
		
		System.out.println("Triangle is " + area );
	}
}
