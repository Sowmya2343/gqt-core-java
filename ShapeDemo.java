package Abstraction;

abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Triangle extends Shape {
    void calculateArea() { System.out.println("Triangle Area: 0.5 * b * h"); }
    void calculatePerimeter() { System.out.println("Triangle Perimeter: a + b + c"); }
}

class Circle extends Shape {
    void calculateArea() { System.out.println("Circle Area: π * r^2"); }
    void calculatePerimeter() { System.out.println("Circle Perimeter: 2 * π * r"); }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape t = new Triangle();
        Shape c = new Circle();
        t.calculateArea(); t.calculatePerimeter();
        c.calculateArea(); c.calculatePerimeter();
    }
}
