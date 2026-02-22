package come.gqt;

public class Car5 {


	    private String model;
	    private String color;
	    private double price;

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public void setPrice(double price) {
	        if (price > 0) {
	            this.price = price;
	        } else {
	            System.out.println("Invalid price!");
	        }
	    }

	    public String getModel() {
	        return model;
	    }

	    public String getColor() {
	        return color;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void display() {
	        System.out.println("Car Model: " + model);
	        System.out.println("Car Color: " + color);
	        System.out.println("Car Price: " + price);
	    }

	    public static void main(String[] args) {

	        Car5 c1 = new Car5();

	        c1.setModel("Honda City");
	        c1.setColor("White");
	        c1.setPrice(1200000);

	        c1.display();
	    }
	}