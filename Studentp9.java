package come.gqt;


	class Student1 {

	    private String name;
	    private int roll;
	    private double mark;

	    public Student1(String name, int roll, double mark) {
	        this.name = name;
	        this.roll = roll;
	        this.mark = mark;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getRoll() {
	        return roll;
	    }

	    public double getMark() {
	        return mark;
	    }
	}

	public class Studentp9 {

	    public static void main(String[] args) {

	        Student1 s1 = new Student1("Anil", 101, 85.5);

	        System.out.println("Student Name: " + s1.getName());
	        System.out.println("Roll Number: " + s1.getRoll());
	        System.out.println("Marks: " + s1.getMark());
	    }
	}