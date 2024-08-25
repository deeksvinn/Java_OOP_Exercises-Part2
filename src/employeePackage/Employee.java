// Employee : This is super class Employee which has attributes employee name,job title and salary.
// This class has a super class method calculate salary.

package employeePackage;

public class Employee {
	
	public String empName;
	public String jobTitle;
	public double salary;

	// Constructor
	
	public Employee(String empName, String jobTitle, double salary) {
		
		super();
		this.empName = empName;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	
	// Getters and setters for employee name,job title and salary
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// Super class method calculate salary which is also used to print the details of employee

	public void calculateSalary() {
		
		System.out.println("\n");
		System.out.println("Employee name: " + this.getEmpName());
		System.out.println("Employee title: " + this.getJobTitle());
		System.out.println("Employee salary: " + this.getSalary());
	}
}
