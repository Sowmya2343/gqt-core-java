package Interface;

interface Drawable {
    void draw();
}

interface Erasable {
    void erase();
}

class Whiteboard implements Drawable, Erasable {
    public void draw(){
        System.out.println("Drawing on whiteboard...");
    }
    public void erase(){
        System.out.println("Erasing whiteboard...");
    }
}

public class Ex21_DrawErase {
    public static void main(String[] args) {
        Whiteboard w = new Whiteboard();
        w.draw();
        w.erase();
    }
}