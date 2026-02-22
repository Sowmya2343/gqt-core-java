package come.gqt;

public class NumberofObject1 {



	    static int count = 0;  

	 NumberofObject1() {
	        count++;   
	    }

	    void displayCount() {
	        System.out.println("Number of objects created: " + count);
	    }

	    public static void main(String[] args) {

	    	NumberofObject1 obj1 = new NumberofObject1();
	    	NumberofObject1 obj2 = new NumberofObject1();
	    	NumberofObject1 obj3 = new NumberofObject1();

	        obj1.displayCount();
	    }
	}