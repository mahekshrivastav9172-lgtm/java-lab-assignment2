package assignment2;

public class ProgrammerEmp extends DeveloperEmp {
	private String proglanguage;

    public ProgrammerEmp(String name, double salary, String projectname, String proglanguage) {
        super(name, salary, projectname);
        this.proglanguage = proglanguage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Programming Language: " + proglanguage);
    }
}
	