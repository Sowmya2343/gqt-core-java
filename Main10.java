package Inheritance;

class Animal {
    String name;
    String type;

    Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String type, String breed) {
        super(name, type);
        this.breed = breed;
    }

    void displayDog() {
        System.out.println(name + " " + type + " " + breed);
    }
}

class Cat extends Animal {
    String color;

    Cat(String name, String type, String color) {
        super(name, type);
        this.color = color;
    }

    void displayCat() {
        System.out.println(name + " " + type + " " + color);
    }
}

public class Main10 {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy", "Pet", "Labrador");
        d.displayDog();
    }
}