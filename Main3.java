package Inheritance;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayAnimal() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    void displayDog() {
        displayAnimal();
        System.out.println("Breed: " + breed);
    }
}

class Cat extends Animal {
    String color;

    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    void displayCat() {
        displayAnimal();
        System.out.println("Color: " + color);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy", 3, "Labrador");
        d.displayDog();
    }
}
