package Abstraction;

abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    void start() { System.out.println("Car starts with a key."); }
    void stop() { System.out.println("Car stops with disc brakes."); }
}

class Motorcycle extends Vehicle {
    void start() { System.out.println("Motorcycle starts with a button."); }
    void stop() { System.out.println("Motorcycle stops with hand brakes."); }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();
        v1.start(); v1.stop();
        v2.start(); v2.stop();
    }
}
