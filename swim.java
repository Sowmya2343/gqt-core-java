package Interface;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying...");
    }
}

class Fish implements Swimmable {
    public void swim() {
        System.out.println("Fish is swimming...");
    }
}