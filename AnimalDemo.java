package Abstraction;

abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Dog extends Animal {
    void eat() { System.out.println("Dog eats bones."); }
    void sleep() { System.out.println("Dog sleeps in a kennel."); }
}

class Cat extends Animal {
    void eat() { System.out.println("Cat eats fish."); }
    void sleep() { System.out.println("Cat sleeps on the sofa."); }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.eat(); myDog.sleep();
        myCat.eat(); myCat.sleep();
    }
}