// 6. Write a Java program to create a class Shape with methods getArea() and getPerimeter().
// Create three subclasses: Circle, Rectangle, and Triangle. Override the getArea() and getPerimeter()
// methods in each subclass to calculate and return the area and perimeter of the respective shapes.

package secondShapePackage;

public class Main {

	public static void main(String[] args) {
		
		// Objects for circle,rectangle and triangle
		
		Circle circle = new Circle(5.0);
		
		Rectangle rectangle = new Rectangle(1.0,2.0);
		
		Triangle triangle = new Triangle(1.0,2.0,3.0,4.0,5.0);
		
		// Calling methods getArea and getPerimeter for circle,rectngle and triangle
		
		circle.getArea();
		
		circle.getPerimeter();
		
		rectangle.getArea();
		
		rectangle.getPerimeter();
		
		triangle.getArea();
		
		triangle.getPerimeter();
	}
}
