package Inheritance;

class Vehicle {
    String make;
    String model;
    int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Truck extends Vehicle {
    int capacity;
    int mileage;

    Truck(String make, String model, int year, int capacity, int mileage) {
        super(make, model, year);
        this.capacity = capacity;
        this.mileage = mileage;
    }

    void displayTruck() {
        System.out.println(make + " " + model + " " + year);
        System.out.println("Capacity: " + capacity);
        System.out.println("Mileage: " + mileage);
    }
}

public class Main8 {
    public static void main(String[] args) {
        Truck t = new Truck("Tata", "LPT", 2023, 10, 8);
        t.displayTruck();
    }
}
