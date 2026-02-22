package Interface;

interface Sortable {
    void sort();
}

interface Searchable {
    void search();
}

class MyListClass implements Sortable, Searchable {
    public void sort(){
        System.out.println("Sorting list...");
    }
    public void search(){
        System.out.println("Searching in list...");
    }
}

public class Ex11_SortSearch {
    public static void main(String[] args) {
        MyListClass obj = new MyListClass();
        obj.sort();
        obj.search();
    }
}