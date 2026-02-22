package Abstraction;


abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Rectangle extends Shape {
    double length = 10, width = 5;

    @Override
    void calculateArea() {
        System.out.println("Rectangle Area: " + (length * width));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Rectangle Perimeter: " + (2 * (length + width)));
    }
}

class Circle extends Shape {
    double radius = 7;

    @Override
    void calculateArea() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Circle Perimeter: " + (2 * Math.PI * radius));
    }
}