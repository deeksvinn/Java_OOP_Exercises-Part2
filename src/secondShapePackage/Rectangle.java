// This is part of 6th program
// This is sub class Rectangle which overrides the super class methods getArea and getPerimeter 

package secondShapePackage;

public class Rectangle extends Shape {

	 double length;
	 double width;

	// Constructor
	 
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
	}
	
	// Getters and setters for length and width

	public double getLength() {
		
		return length;
	}

	public void setLength(double length) {
		
		this.length = length;
	}

	public double getWidth() {
		
		return width;
	}

	public void setWidth(double width) {
		
		this.width = width;
	}

	// Method to find area of a rectangle
	
	@Override
	
	public void getArea() {
		
		System.out.println("Area of rectangle : " + (length * width));
	}

	// Method to find perimeter of a rectangle
	
	@Override
	
	public void getPerimeter() {
	
		System.out.println("Perimeter of rectangle : " + (2 * (length + width)));
	}
}
