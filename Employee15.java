package come.gqt;


	class Employee {

	    private String name;
	    private int id;
	    private double salary;

	    public Employee(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
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
	}

	public class Employee15 {

	    public static void main(String[] args) {

	        Employee e1 = new Employee("Anita", 1001, 50000);

	        System.out.println("Employee Name: " + e1.getName());
	        System.out.println("Employee ID: " + e1.getId());
	        System.out.println("Employee Salary: " + e1.getSalary());
	    }
	}