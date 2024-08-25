// This is part of 3rd program
// Package : firstShapePackage
// Shape : This is sub class Circle with attribute radius and calculateArea method
// is overridden in this class to calculate area of a Circle

package firstShapePackage;

public class Circle extends Shape {

	public double radius;

    // Constructor 
    
    public Circle(double radius) {
    	
        this.radius = radius;
    }

    // Ovverride method to calculate area of a triangle
	
 	@Override
  
 	
	public void calculateArea() {
 		
        super.calculateArea();
        
        area = Math.PI * radius * radius;
        
        System.out.println("Circle is " + area);
    }

}
