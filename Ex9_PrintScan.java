package Interface;

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class Printer implements Printable {
    public void print(){
        System.out.println("Printing...");
    }
}

class ScannerDevice implements Scannable {
    public void scan(){
        System.out.println("Scanning...");
    }
}

public class Ex9_PrintScan {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();

        ScannerDevice s = new ScannerDevice();
        s.scan();
    }
}