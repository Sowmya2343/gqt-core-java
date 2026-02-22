package Inheritance;

 class Shape {
	
	    double calculateArea() {
	        return 0;
	    }

	    double calculatePerimeter() {
	        return 0;
	    }
	}

	class Circle extends Shape {
	    double radius;

	    Circle(double radius) {
	        this.radius = radius;
	    }

	    double calculateArea() {
	        return 3.14 * radius * radius;
	    }

	    double calculatePerimeter() {
	        return 2 * 3.14 * radius;
	    }
	}

	class Rectangle extends Shape {
	    double length, width;

	    Rectangle(double l, double w) {
	        length = l;
	        width = w;
	    }

	    double calculateArea() {
	        return length * width;
	    }

	    double calculatePerimeter() {
	        return 2 * (length + width);
	    }
	}

	public class Main2 {
	    public static void main(String[] args) {
	        Circle c = new Circle(5);
	        System.out.println("Circle Area: " + c.calculateArea());

	        Rectangle r = new Rectangle(4, 6);
	        System.out.println("Rectangle Area: " + r.calculateArea());
	    }
	}


