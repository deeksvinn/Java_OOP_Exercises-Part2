// 4. Write a Java program to create a class Employee with a method called calculateSalary(). 
// Create two subclasses Manager and Programmer.In each subclass, override the calculateSalary()
// method to calculate and return the salary based on their specific roles.

package employeePackage;

public class Main {

	public static void main(String[] args) {
		
		// Creating objects for manager and programmer
		
		Manager manager = new Manager("Tom","Manager", 60000);
		Programmer programmer = new Programmer("Jack","Programmer",40000);
		
		// Calling calculateSalary method for manager and programmer
		
		manager.calculateSalary();
		programmer.calculateSalary();		
	}
}
