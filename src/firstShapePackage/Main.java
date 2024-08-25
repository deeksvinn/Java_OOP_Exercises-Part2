// 3. Write a Java program to create a base class Shape with a method called calculateArea(). 
// Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() 
// method in each subclass to calculate and return the shape's area.

package firstShapePackage;

public class Main {

	public static void main(String[] args) {
		
		// Creating the objects for circle,triangle and rectangle
		
		Circle circle = new Circle(2.0);
		Triangle triangle = new Triangle(2.0,3.0);
		Rectangle rectangle = new Rectangle(4.0,5.0);
		
		// Calling the method to calculate area
		
		circle.calculateArea();
		triangle.calculateArea();
		rectangle.calculateArea();
	}
}
