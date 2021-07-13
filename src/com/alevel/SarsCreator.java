package com.alevel;

public class SarsCreator implements ClocksFactory {

    @Override
    public Clocks createClocks() {
        return new Sars();
    }
}
