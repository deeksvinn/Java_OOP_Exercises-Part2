// Employee : This is sub class Manager for super class Employee where calculateSalary method is override for job title manager

package employeePackage;

public class Manager extends Employee {

	public Manager(String empName, String jobTitle, double salary) {
		
		super(empName, jobTitle, salary);
	
	}

	// Ovverride method calculateSalary to update the salary of manager 
	
	@Override
	
	public void calculateSalary() {
		
		super.calculateSalary();
		
		salary = salary * 20;
		
		System.out.println("Updated salary: " + salary);
	}	
}
