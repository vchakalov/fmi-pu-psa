package com.pu.fmi.workshop;

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
