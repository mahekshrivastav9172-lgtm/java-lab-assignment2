package assignment2;
import java.util.Scanner;
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.142 * radius * radius;
    }
}

class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Total surface area = 2 * (circle area) + 2*PI*r*h
    double area() {
        return 2 * super.area() + 2 * 3.142 * radius * height;
    }
}

public class AreaDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double h = sc.nextDouble();

        Circle c = new Circle(r);
        Cylinder cy = new Cylinder(r, h);

        System.out.println("Area of Circle = " + c.area());
        System.out.println("Area of Cylinder = " + cy.area());
    }


	}


