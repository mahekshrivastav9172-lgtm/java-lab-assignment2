package assignment2;

public class EmployeeDetails {
	protected String name;
    protected double salary;

    // Parameterized Constructor
    public EmployeeDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Display method to show name and salary
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


		