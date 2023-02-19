package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music{
    private List<String> rockList = new ArrayList<>();

    public RockMusic() {
        this.rockList.add("Nickelback");
        this.rockList.add("ACDC");
        this.rockList.add("SomeRockMusic");
    }

    @Override
    public List<String> getSongsList() {
        return rockList;
    }
}
