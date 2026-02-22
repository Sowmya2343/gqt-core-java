package Abstraction;

abstract class Employee {
    abstract void calculateSalary();
    abstract void calculateBonus();
}

class Manager extends Employee {
    void calculateSalary() { System.out.println("Manager Salary: $8000"); }
    void calculateBonus() { System.out.println("Manager Bonus: $2000"); }
}

class Clerk extends Employee {
    void calculateSalary() { System.out.println("Clerk Salary: $3000"); }
    void calculateBonus() { System.out.println("Clerk Bonus: $500"); }
}

public class EmployeeDemo1 {
    public static void main(String[] args) {
        Employee m = new Manager();
        Employee c = new Clerk();
        m.calculateSalary(); m.calculateBonus();
        c.calculateSalary(); c.calculateBonus();
    }
}