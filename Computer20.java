package come.gqt;



	class Computer {

	    private String brand;
	    private String model;
	    private double price;

	    public Computer(String brand, String model, double price) {
	        this.brand = brand;
	        this.model = model;
	        this.price = price;
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
	}

	public class Computer20 {

	    public static void main(String[] args) {

	        Computer c1 = new Computer("HP", "Pavilion", 60000);

	        System.out.println("Brand: " + c1.getBrand());
	        System.out.println("Model: " + c1.getModel());
	        System.out.println("Price: " + c1.getPrice());
	    }
	}