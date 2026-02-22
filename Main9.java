package Inheritance;

class Fruit {
    String name;
    String color;

    Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

class Apple extends Fruit {
    String taste;

    Apple(String name, String color, String taste) {
        super(name, color);
        this.taste = taste;
    }

    void displayApple() {
        System.out.println(name + " " + color + " " + taste);
    }
}

class Banana extends Fruit {
    String size;

    Banana(String name, String color, String size) {
        super(name, color);
        this.size = size;
    }

    void displayBanana() {
        System.out.println(name + " " + color + " " + size);
    }
}

public class Main9 {
    public static void main(String[] args) {
        Apple a = new Apple("Apple", "Red", "Sweet");
        a.displayApple();
    }
}
