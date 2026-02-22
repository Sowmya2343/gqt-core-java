package Interface;

class Number implements Comparable<Number>, Cloneable {
    int value;
    Number(int v){ value = v; }

    public int compareTo(Number n){
        return this.value - n.value;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Person implements Comparable<Person>, Cloneable {
    String name;
    Person(String n){ name = n; }

    public int compareTo(Person p){
        return this.name.compareTo(p.name);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class Ex5_ComparableCloneable {
    public static void main(String[] args) throws Exception {
        Number n1 = new Number(10);
        Number n2 = new Number(20);
        System.out.println("Compare Numbers: " + n1.compareTo(n2));

        Person p1 = new Person("A");
        Person p2 = new Person("B");
        System.out.println("Compare Persons: " + p1.compareTo(p2));
    }
}