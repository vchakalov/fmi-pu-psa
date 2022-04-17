package com.pu.fmi.workshop.commands;

import com.pu.fmi.workshop.MagicBoardListener;
import com.pu.fmi.workshop.toys.Toy;
import com.pu.fmi.workshop.toys.ToyType;

public class DollCommand implements Command {
    private MagicBoardListener magicBoard;

    public DollCommand(MagicBoardListener magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public Toy executeCommand() {
        return magicBoard.setType(ToyType.Doll);
    }

    @Override
    public String getCommandName() {
        return "Трябват ми кукли";
    }
}
