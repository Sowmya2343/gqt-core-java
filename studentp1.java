package come.gqt;

public class studentp1 {

	

	    private String name;
	    private int rollNo;
	    private int age;

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setRollNo(int rollNo) {
	        this.rollNo = rollNo;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getRollNo() {
	        return rollNo;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Age: " + age);
	    }

	    public static void main(String[] args) {

	    	studentp1  s1 = new studentp1 ();

	      
	        s1.setName("Amit");
	        s1.setRollNo(101);
	        s1.setAge(20);

	       
	        s1.display();

	        System.out.println("Student Name: " + s1.getName());
	        System.out.println("Student Roll No: " + s1.getRollNo());
	        System.out.println("Student Age: " + s1.getAge());
	    }
	}