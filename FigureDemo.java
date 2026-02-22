package Abstraction;

abstract class Figure {
    abstract void draw();
    abstract void erase();
}

class RectangleFigure extends Figure {
    void draw() { System.out.println("Drawing a Rectangle."); }
    void erase() { System.out.println("Erasing a Rectangle."); }
}

class CircleFigure extends Figure {
    void draw() { System.out.println("Drawing a Circle."); }
    void erase() { System.out.println("Erasing a Circle."); }
}

public class FigureDemo {
    public static void main(String[] args) {
        Figure f1 = new RectangleFigure();
        Figure f2 = new CircleFigure();
        f1.draw(); f1.erase();
        f2.draw(); f2.erase();
    }
}