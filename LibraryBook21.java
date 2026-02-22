package come.gqt;

public class LibraryBook21 {


	    private String author;
	    private String title;
	    private double price;

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public void setPrice(double price) {
	        if (price > 0) {
	            this.price = price;
	        } else {
	            System.out.println("Invalid price!");
	        }
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void display() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: " + price);
	    }

	    public static void main(String[] args) {

	        LibraryBook21 b1 = new LibraryBook21();

	        b1.setAuthor("R.K. Narayan");
	        b1.setTitle("Malgudi Days");
	        b1.setPrice(350);

	        b1.display();

	        System.out.println("Book Title: " + b1.getTitle());
	        System.out.println("Book Author: " + b1.getAuthor());
	        System.out.println("Book Price: " + b1.getPrice());
	    }
	}