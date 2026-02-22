package Abstraction;

abstract class VehicleDrive {
    abstract void drive();
    abstract void stop();
}

class CarDrive extends VehicleDrive {
    void drive() { System.out.println("Driving the car on the highway."); }
    void stop() { System.out.println("Car stopped."); }
}

class Truck extends VehicleDrive {
    void drive() { System.out.println("Truck is hauling cargo."); }
    void stop() { System.out.println("Truck stopped."); }
}

public class TruckDemo {
    public static void main(String[] args) {
        VehicleDrive car = new CarDrive();
        VehicleDrive truck = new Truck();
        car.drive(); car.stop();
        truck.drive(); truck.stop();
    }
}