package Interface;

interface Encryptable {
    void encrypt();
}

interface Decryptable {
    void decrypt();
}

class Encoder implements Encryptable {
    public void encrypt(){
        System.out.println("Encrypting data...");
    }
}

class Decoder implements Decryptable {
    public void decrypt(){
        System.out.println("Decrypting data...");
    }
}

public class Ex15_EncryptDecrypt {
    public static void main(String[] args) {
        Encoder e = new Encoder();
        e.encrypt();

        Decoder d = new Decoder();
        d.decrypt();
    }
}