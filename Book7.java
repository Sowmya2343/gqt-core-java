package come.gqt;

public class Book7 {


	    private String title;
	    private String author;
	    private double price;

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public void setPrice(double price) {
	        if (price > 0) {
	            this.price = price;
	        } else {
	            System.out.println("Invalid price!");
	        }
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void display() {
	        System.out.println("Book Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: " + price);
	    }

	    public static void main(String[] args) {

	        Book7 b1 = new Book7();

	        b1.setTitle("Java Programming");
	        b1.setAuthor("James Gosling");
	        b1.setPrice(499.99);

	        b1.display();
	    }
	}