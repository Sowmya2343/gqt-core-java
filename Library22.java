package come.gqt;


	class LibraryBook {

	    private String author;
	    private String title;
	    private double price;

	    public LibraryBook(String author, String title, double price) {
	        this.author = author;
	        this.title = title;
	        this.price = price;
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
	}

	public class Library22 {

	    public static void main(String[] args) {

	        LibraryBook b1 = new LibraryBook("R.K. Narayan", "Malgudi Days", 350);

	        System.out.println("Book Title: " + b1.getTitle());
	        System.out.println("Book Author: " + b1.getAuthor());
	        System.out.println("Book Price: " + b1.getPrice());
	    }
	}