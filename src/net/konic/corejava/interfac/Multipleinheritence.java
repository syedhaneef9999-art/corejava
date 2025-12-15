package net.konic.corejava.interfac;
interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Mobile implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Photo clicked");
    }

    public void playMusic() {
        System.out.println("Music playing");
    }
}

public class Multipleinheritence {

	public static void main(String[] args) {
		Mobile m = new Mobile();
        m.takePhoto();
        m.playMusic();

	}

}
