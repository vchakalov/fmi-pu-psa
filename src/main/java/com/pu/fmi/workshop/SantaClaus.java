package com.pu.fmi.workshop;

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
