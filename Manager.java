package assignment2;

public class Manager extends Employee {
	 private double bonus;

	    public Manager() {
	        super();
	        bonus = 0;
	    }

	    public Manager(int id, String name, String department,
	                   double salary, double bonus) {
	        super(id, name, department, salary);
	        this.bonus = bonus;
	    }

	    @Override
	    public void accept() {
	        super.accept();

	        java.util.Scanner sc = new java.util.Scanner(System.in);
	        System.out.print("Enter Bonus: ");
	        bonus = sc.nextDouble();
	    }

	    @Override
	    public void display() {
	        super.display();
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Total Salary: "
	                + (getSalary() + bonus));
	    }

	    public double getTotalSalary() {
	        return getSalary() + bonus;
	    }

	    public static void main(String[] args) {
	        Manager m1 = new Manager();
	        Manager m2 = new Manager();

	        System.out.println("Enter details of Manager 1:");
	        m1.accept();

	        System.out.println("\nEnter details of Manager 2:");
	        m2.accept();

	        System.out.println("\nManager with Maximum Total Salary:");

	        if (m1.getTotalSalary() >= m2.getTotalSalary()) {
	            m1.display();
	        } else {
	            m2.display();
	        }
	    }
	}
	
