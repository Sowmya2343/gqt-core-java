package Inheritance;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println(name + " " + id + " " + salary);
    }
}

class Manager extends Employee {
    String department;
    String designation;

    Manager(String name, int id, double salary, String dept, String des) {
        super(name, id, salary);
        department = dept;
        designation = des;
    }

    void displayManager() {
        displayEmployee();
        System.out.println(department + " " + designation);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Manager m = new Manager("Ravi", 101, 50000, "HR", "Senior Manager");
        m.displayManager();
    }
}
