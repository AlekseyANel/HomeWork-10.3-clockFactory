package com.alevel;

public class HermleCreator implements ClocksFactory {

    @Override
    public Clocks createClocks() {
        return new Hermle();
    }
}
