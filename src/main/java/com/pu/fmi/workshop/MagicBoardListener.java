package com.pu.fmi.workshop;

import com.pu.fmi.workshop.toys.Toy;
import com.pu.fmi.workshop.toys.ToyType;

public class MagicBoardListener {
    private Dwarfs dwarfs;
    private MagicBoard magicBoard;

    public MagicBoardListener() {
        dwarfs = new Dwarfs();
        magicBoard = new MagicBoard();
    }

    public Toy setType(ToyType toy) {
        System.out.println("изписваме на дъската играчка от тип " + toy.type());
        magicBoard.setType(toy);
        System.out.println("известяваме джуджетата");
        return dwarfs.createToy(magicBoard);
    }
}
