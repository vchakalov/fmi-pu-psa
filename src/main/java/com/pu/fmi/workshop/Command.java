package com.pu.fmi.workshop;

public interface Command {
    Toy executeCommand();
    String getCommandName();
}
