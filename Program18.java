package Abstraction;

public class Program18 {
    public static void main(String[] args) {
        // Using polymorphism to refer to subclass objects via abstract parent
        Shape rect = new Rectangle();
        Shape circ = new Circle();

        System.out.println("--- Rectangle Details ---");
        rect.calculateArea();
        rect.calculatePerimeter();

        System.out.println("\n--- Circle Details ---");
        circ.calculateArea();
        circ.calculatePerimeter();
    }
}
