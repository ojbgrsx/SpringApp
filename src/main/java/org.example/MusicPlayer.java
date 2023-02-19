package org.example;

import java.util.List;
import java.util.Random;

public class MusicPlayer{

    private List<Music> musicList;


    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }
    public String playMusic() {
        Random random = new Random();
        return musicList.get(random.nextInt(3)).getSongsList().get(random.nextInt(3));
    }
}
