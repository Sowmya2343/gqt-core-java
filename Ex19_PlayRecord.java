package Interface;

interface Playable {
    void play();
}

interface Recordable {
    void record();
}

class MusicPlayer implements Playable {
    public void play(){
        System.out.println("Playing music...");
    }
}

class Recorder implements Recordable {
    public void record(){
        System.out.println("Recording...");
    }
}

public class Ex19_PlayRecord {
    public static void main(String[] args) {
        MusicPlayer m = new MusicPlayer();
        m.play();

        Recorder r = new Recorder();
        r.record();
    }
}