package org.example;


import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music{
    private List<String> classicalList = new ArrayList<>();

    {
        this.classicalList.add("Ludovico Elinaudi");
        this.classicalList.add("Beethoven");
        this.classicalList.add("The Beatles");
    }

    @Override
    public List<String> getSongsList() {
        return classicalList;
    }
}
