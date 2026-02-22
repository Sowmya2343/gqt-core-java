package come.gqt;


	public class Circle11 {

	    private double radius;

	    public void setRadius(double radius) {
	        if (radius > 0) {
	            this.radius = radius;
	        } else {
	            System.out.println("Invalid radius!");
	        }
	    }

	    public double getRadius() {
	        return radius;
	    }

	    public double getArea() {
	        return Math.PI * radius * radius;
	    }

	    public double getCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    public static void main(String[] args) {

	        Circle11 c1 = new Circle11();

	        c1.setRadius(7);

	        System.out.println("Radius: " + c1.getRadius());
	        System.out.println("Area: " + c1.getArea());
	        System.out.println("Circumference: " + c1.getCircumference());
	    }
	}