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

    void displayVehicle() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    String color;
    int mileage;

    Car(String make, String model, int year, String color, int mileage) {
        super(make, model, year);
        this.color = color;
        this.mileage = mileage;
    }

    void displayCar() {
        displayVehicle();
        System.out.println("Color: " + color);
        System.out.println("Mileage: " + mileage);
    }
}//

public class Main1 {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Innova", 2022, "White", 18);
        c.displayCar();
    }
}
	