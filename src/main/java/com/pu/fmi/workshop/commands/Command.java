package com.pu.fmi.workshop.commands;

import com.pu.fmi.workshop.toys.Toy;

public interface Command {
    Toy executeCommand();
    String getCommandName();
}
