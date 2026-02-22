package Interface;
interface Writable {
    void write();
}

interface Readable {
    void read();
}

class TextFile implements Writable, Readable {
    public void write(){
        System.out.println("Writing to file...");
    }
    public void read(){
        System.out.println("Reading from file...");
    }
}

public class Ex27_WriteRead {
    public static void main(String[] args) {
        TextFile t = new TextFile();
        t.write();
        t.read();
    }
}