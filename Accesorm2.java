package come.gqt;

 class Student {


	    private String name;
	    private int rollNo;

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setRollNo(int rollNo) {
	        this.rollNo = rollNo;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getRollNo() {
	        return rollNo;
	    }
	}

	public class Accesorm2 {

	    public static void main(String[] args) {

	        Student s1 = new Student();

	        s1.setName("Ravi");
	        s1.setRollNo(102);

	        System.out.println("Student Name: " + s1.getName());
	        System.out.println("Student Roll No: " + s1.getRollNo());
	    }
	}