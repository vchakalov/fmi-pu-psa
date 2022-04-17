package com.pu.fmi.workshop;

import com.pu.fmi.workshop.commands.Command;
import com.pu.fmi.workshop.toys.Toy;

import java.util.List;

public class SantaClaus {
    private SantaClausCommandExecutor santaClausCommandExecutor;

    public SantaClaus(List<Command> commandList) {
        santaClausCommandExecutor = new SantaClausCommandExecutor(commandList);
    }

    public Toy orderToy(String command) {
        return santaClausCommandExecutor.execute(command);
    }
}
