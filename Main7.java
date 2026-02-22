package Inheritance;

class Shape {
    String type;
    String color;

    Shape(String type, String color) {
        this.type = type;
        this.color = color;
    }

    void displayShape() {
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(String type, String color, double base, double height) {
        super(type, color);
        this.base = base;
        this.height = height;
    }

    void displayTriangle() {
        displayShape();
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
    }
}

public class Main7 {
    public static void main(String[] args) {
        Triangle t = new Triangle("Triangle", "Red", 5, 10);
        t.displayTriangle();
    }
}