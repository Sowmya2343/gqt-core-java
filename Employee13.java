package come.gqt;

public class Employee13 {



	    private String name;
	    private int id;
	    private double salary;

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setSalary(double salary) {
	        if (salary > 0) {
	            this.salary = salary;
	        } else {
	            System.out.println("Invalid salary!");
	        }
	    }

	    public String getName() {
	        return name;
	    }

	    public int getId() {
	        return id;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void display() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee ID: " + id);
	        System.out.println("Employee Salary: " + salary);
	    }

	    public static void main(String[] args) {

	        Employee13 e1 = new Employee13();

	        e1.setName("Rahul");
	        e1.setId(1001);
	        e1.setSalary(45000);

	        e1.display();
	    }
	}