package come.gqt;

public class Mobile14 {


	    private String brand;
	    private String model;
	    private double price;

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public void setPrice(double price) {
	        if (price > 0) {
	            this.price = price;
	        } else {
	            System.out.println("Invalid price!");
	        }
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public String getModel() {
	        return model;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void display() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Price: " + price);
	    }

	    public static void main(String[] args) {

	        Mobile14 m1 = new Mobile14();

	        m1.setBrand("Samsung");
	        m1.setModel("Galaxy S23");
	        m1.setPrice(75000);
	        m1.display();

	        System.out.println("Mobile Brand: " + m1.getBrand());
	        System.out.println("Mobile Model: " + m1.getModel());
	        System.out.println("Mobile Price: " + m1.getPrice());
	    }
	}