package Interface;

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle...");
    }
}

public class InterfaceProgram2 {
    public static void main(String[] args) {
        Drawable obj = new Circle();
        obj.draw();
    }
}