package com.pu.fmi.workshop;

import com.pu.fmi.workshop.toys.Toy;
import com.pu.fmi.workshop.toys.ToyFactory;

public class Dwarfs {
    public Toy createToy(MagicBoard magicBoard) {
        return ToyFactory.createToy(magicBoard.getType());
    }
}
