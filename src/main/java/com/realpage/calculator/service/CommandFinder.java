package com.realpage.calculator.service;

import com.realpage.calculator.commands.AbstractCommand;
import com.realpage.calculator.commands.AdditionCommand;
import com.realpage.calculator.commands.ExitCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandFinder {
    private List<AbstractCommand> possibleCommands = new ArrayList<>();

    public CommandFinder() {
        possibleCommands.add(new AdditionCommand());
        possibleCommands.add(new ExitCommand());
    }

    public AbstractCommand findCommand(String operator) {
        return possibleCommands.stream()
                .filter(abstractCommand -> abstractCommand.isSuitableInputOperator(operator))
                .findFirst()
                .orElse(null);
    }
}