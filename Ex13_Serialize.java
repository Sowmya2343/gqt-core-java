package Interface;

interface SerializableData {
    void serialize();
}

interface DeserializableData {
    void deserialize();
}

class FileData implements SerializableData, DeserializableData {
    public void serialize(){
        System.out.println("Serializing file...");
    }
    public void deserialize(){
        System.out.println("Deserializing file...");
    }
}

public class Ex13_Serialize {
    public static void main(String[] args) {
        FileData f = new FileData();
        f.serialize();
        f.deserialize();
    }
}
