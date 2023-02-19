package org.example;


public class Computer {
    private int id;
    private MusicGenre musicGenre;
    private MusicPlayer musicPlayer;

    public void setMusicGenre(MusicGenre musicGenre) {
        this.musicGenre = musicGenre;
    }

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer "+id+" "+musicPlayer.playMusic();
    }
}
