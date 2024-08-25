// Employee : This is sub class Programmer for super class Employee where calculateSalary method is override for job title Programmer
package employeePackage;

public class Programmer extends Employee {

	public Programmer(String empName, String jobTitle, double salary) {
		super(empName, jobTitle, salary);
	
	}

	// Ovverride method calculateSalary to update the salary of programmer
	
	@Override
	
	public void calculateSalary() {
		
		super.calculateSalary();
		
		salary = salary * 10;
		
		System.out.println("Updated salary: " + salary);
	}
}
