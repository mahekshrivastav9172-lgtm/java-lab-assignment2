package assignment2;

public class ShapeArea implements shape {
	  public double circleArea(double radius) {
	        return PI * radius * radius;
	    }

	    public double sphereArea(double radius) {
	        return 4 * PI * radius * radius;
	    }
	public static void main(String[] args) {
		 ShapeArea S= new ShapeArea();

	        double radius = 5;

	        System.out.println("Area of Circle = "
	                + S.circleArea(radius));

	        System.out.println("Surface Area of Sphere = "
	                + S.sphereArea(radius));
	    
	
		
	}

}
