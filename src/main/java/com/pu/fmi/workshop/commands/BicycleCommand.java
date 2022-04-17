package com.pu.fmi.workshop.commands;

import com.pu.fmi.workshop.MagicBoardListener;
import com.pu.fmi.workshop.toys.Toy;
import com.pu.fmi.workshop.toys.ToyType;

public class BicycleCommand implements Command {
    private MagicBoardListener magicBoard;

    public BicycleCommand(MagicBoardListener magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public Toy executeCommand() {
        return magicBoard.setType(ToyType.Bicycle);
    }

    @Override
    public String getCommandName() {
        return "Трябват ми колелата";
    }
}
