package assignment2;
import java.util.Scanner;

	public class Employee {
	    private int id;
	    private String name;
	    private String department;
	    private double salary;

	    public Employee() {
	        id = 0;
	        name = "";
	        department = "";
	        salary = 0;
	    }

	    public Employee(int id, String name,
	                    String department, double salary) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	    }

	    public void accept() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter ID: ");
	        id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Name: ");
	        name = sc.nextLine();

	        System.out.print("Enter Department: ");
	        department = sc.nextLine();

	        System.out.print("Enter Salary: ");
	        salary = sc.nextDouble();
	    }

	    public void display() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: " + salary);
	    }

	    public double getSalary() {
	        return salary;
	    }
	}

	