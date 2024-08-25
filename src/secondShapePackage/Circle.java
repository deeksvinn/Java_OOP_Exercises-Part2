// This is part of 6th program
// This is sub class Circle which overrides the super class methods getArea and getPerimeter 

package secondShapePackage;

public class Circle extends Shape{

	private double radius;

	// Constructor 
	    
	public Circle(double radius) {
	    	
		this.radius = radius;
	}

	// Getter and setter for radius
	  
	public double getRadius() {
	    	
		return radius;
	}
	    
	public void setRadius(double radius) {
			
		this.radius = radius;
	}

	// Method to find area of a circle
		
	@Override
		
	public void getArea() {
	        
		System.out.println("The area of circle: " + (Math.PI * radius * radius));
	}

	// Method to find perimeter of a circle
	   
	@Override
		
	public void getPerimeter() {
	       
		System.out.println("The perimeter of circle: " + (2 * Math.PI * radius));
	}
}
