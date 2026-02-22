package Interface;

interface EncryptAlgo {
    void encrypt();
}

interface DecryptAlgo {
    void decrypt();
}

class Encryption implements EncryptAlgo {
    public void encrypt(){
        System.out.println("Encrypting using algorithm...");
    }
}

class Decryption implements DecryptAlgo {
    public void decrypt(){
        System.out.println("Decrypting using algorithm...");
    }
}

public class Ex25_Algo {
    public static void main(String[] args) {
        Encryption e = new Encryption();
        e.encrypt();

        Decryption d = new Decryption();
        d.decrypt();
    }
}