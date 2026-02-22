package Inheritance;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println(name + " " + age + " " + rollNo);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void display() {
        System.out.println(name + " " + age + " " + subject);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Student s = new Student("Sowmya", 24, 45);
        s.display();
    }
}
