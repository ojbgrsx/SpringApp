package org.example;

import java.util.ArrayList;
import java.util.List;
public class RapMusic implements Music {
    private List<String> rapList = new ArrayList<>();

    public RapMusic() {
        this.rapList.add("Godzilla");
        this.rapList.add("True");
        this.rapList.add("Mockingbird");
    }

    @Override
    public List<String> getSongsList() {
        return rapList;
    }
}
