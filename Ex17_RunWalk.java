package Interface;

interface RunnableAnimal {
    void run();
}

interface Walkable {
    void walk();
}

class Cheetah implements RunnableAnimal {
    public void run(){
        System.out.println("Cheetah runs fast!");
    }
}

class Tortoise implements Walkable {
    public void walk(){
        System.out.println("Tortoise walks slowly!");
    }
}

public class Ex17_RunWalk {
    public static void main(String[] args) {
        Cheetah c = new Cheetah();
        c.run();

        Tortoise t = new Tortoise();
        t.walk();
    }
}