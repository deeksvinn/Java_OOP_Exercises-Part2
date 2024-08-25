// This is part of 6th program
// This is sub class Triangle which overrides the super class methods getArea and getPerimeter 

package secondShapePackage;

public class Triangle extends Shape {

	double base;
	double height;
	double side1;
	double side2;
	double side3;
	
	// Constructor
	
	public Triangle(double base, double height, double side1, double side2, double side3) {
		
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Getters and setters for base,height,side1,side2,side3
	
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

	public double getSide1() {
		
		return side1;
	}

	public void setSide1(double side1) {
		
		this.side1 = side1;
	}

	public double getSide2() {
		
		return side2;
	}

	public void setSide2(double side2) {
		
		this.side2 = side2;
	}

	public double getSide3() {
		
		return side3;
	}

	public void setSide3(double side3) {
		
		this.side3 = side3;
	}
	
	// Method to find area of a triangle

	@Override
	
	public void getArea() {
		
		System.out.println("Area of triangle : " + ((base * height) / 2));
	}

	// Method to find perimeter of a triangle
	
	@Override
	
	public void getPerimeter() {
	
		System.out.println("Perimeter of triangle : " + (side1+side2+side3));
	}
}
