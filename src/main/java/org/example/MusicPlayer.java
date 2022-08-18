package org.example;

public class MusicPlayer {
    private Music music;

    private String name;
    private int value;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
