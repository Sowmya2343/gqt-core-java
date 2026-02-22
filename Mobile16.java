package come.gqt;

 class Mobile {


	    private String brand;
	    private String model;
	    private double price;

	    public Mobile(String brand, String model, double price) {
	        this.brand = brand;
	        this.model = model;
	        this.price = price;
	    }

	    // Public accessor (getter) methods
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

	public class Mobile16{

	    public static void main(String[] args) {

	        Mobile m1 = new Mobile("Apple", "iPhone 15", 80000);

	        System.out.println("Brand: " + m1.getBrand());
	        System.out.println("Model: " + m1.getModel());
	        System.out.println("Price: " + m1.getPrice());
	    }
	}