package com.pu.fmi.workshop;

import java.util.List;

public class SantaClausCommandExecutor {
    private List<Command> commands;

    public SantaClausCommandExecutor(List<Command> commands) {
        this.commands = commands;
    }

    public Toy execute(String command) {
        System.out.println("Изпълняване на команда " + command);
        Command commandToExec = commands.stream()
                .filter(c -> command.equalsIgnoreCase(c.getCommandName()))
                .findFirst().orElse(null);
        if (commandToExec == null) {
            System.out.println("Непозната команда!...");
            return null;
        }
        return commandToExec.executeCommand();
    }
}
