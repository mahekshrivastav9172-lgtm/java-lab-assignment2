package assignment2;
import java.util.Scanner;
public class CheckNumber 

	implements Integer {

	    public void check() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        if (n > 0) {
	            System.out.println("Positive Number");
	        } else if (n < 0) {
	            System.out.println("Negative Number");
	        } else {
	            System.out.println("Zero");
	        }
	    }
	public static void main(String[] args) {
		CheckNumber obj = new CheckNumber();
        obj.check();

	}

}
