package come.gqt;

public class Computer19 {


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

	        Computer19 c1 = new Computer19();

	        c1.setBrand("Dell");
	        c1.setModel("Inspiron 15");
	        c1.setPrice(55000);

	        c1.display();

	        System.out.println("Computer Brand: " + c1.getBrand());
	        System.out.println("Computer Model: " + c1.getModel());
	        System.out.println("Computer Price: " + c1.getPrice());
	    }
	}