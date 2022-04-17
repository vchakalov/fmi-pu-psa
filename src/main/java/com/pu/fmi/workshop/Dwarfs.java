package com.pu.fmi.workshop;

public class Dwarfs {
    public Toy createToy(MagicBoard magicBoard) {
        return ToyFactory.createToy(magicBoard.getType());
    }
}
