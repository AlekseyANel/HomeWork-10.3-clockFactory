package com.alevel;

public class HowardMillerCreator implements ClocksFactory {
    @Override
    public Clocks createClocks() {
        return new HowardMiller();
    }
}
