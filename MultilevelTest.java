package assignment2;

public class MultilevelTest {

	public static void main(String[] args) {
		System.out.println("--- Developer Details ---");
        DeveloperEmp dev = new DeveloperEmp("Rahul Sharma", 55000.0, "Online Shopping Portal");
        dev.display();

        System.out.println("\n--- Programmer Details (Multilevel) ---");
        ProgrammerEmp prog = new ProgrammerEmp("Amit Kumar", 75000.0, "Banking System", "Java");
        prog.display();
    }


	}


