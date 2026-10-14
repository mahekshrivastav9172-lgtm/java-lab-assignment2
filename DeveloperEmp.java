package assignment2;

public class DeveloperEmp extends EmployeeDetails {
	 protected String projectname;

	    public DeveloperEmp(String name, double salary, String projectname) {
	        super(name, salary);
	        this.projectname = projectname;
	    }

	    
	    public void display() {
	        super.display();
	        System.out.println("Project Name: " + projectname);
	    }
	}
	
