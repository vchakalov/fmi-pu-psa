package com.pu.fmi.workshop;

import com.pu.fmi.workshop.commands.BicycleCommand;
import com.pu.fmi.workshop.commands.Command;
import com.pu.fmi.workshop.commands.DollCommand;

import java.util.List;

public class Workshop {
    private SantaClaus santaClaus;
    private MagicBoardListener magicBoardListener;

    public Workshop() {
        magicBoardListener = new MagicBoardListener();
        Command createDolls = new DollCommand(magicBoardListener);
        Command createBicycles = new BicycleCommand(magicBoardListener);
        santaClaus = new SantaClaus(List.of(createDolls, createBicycles));
    }

    public SantaClaus getSanta() {
        return santaClaus;
    }
}
