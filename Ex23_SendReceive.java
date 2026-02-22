package Interface;

interface Sendable {
    void send();
}

interface Receiveable {
    void receive();
}

class Transmitter implements Sendable {
    public void send(){
        System.out.println("Sending signal...");
    }
}

class Receiver implements Receiveable {
    public void receive(){
        System.out.println("Receiving signal...");
    }
}

public class Ex23_SendReceive {
    public static void main(String[] args) {
        Transmitter t = new Transmitter();
        t.send();

        Receiver r = new Receiver();
        r.receive();
    }
}