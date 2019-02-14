package com.realpage.calculator.service;

import com.realpage.calculator.commands.AbstractCommand;
import com.realpage.calculator.commands.arithmetic.AdditionCommand;
import com.realpage.calculator.commands.arithmetic.DivisionCommand;
import com.realpage.calculator.commands.arithmetic.MultiplicationCommand;
import com.realpage.calculator.commands.arithmetic.SubtractionCommand;
import com.realpage.calculator.commands.common.ExitCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandFinder {
    private List<AbstractCommand> possibleCommands = new ArrayList<>();

    public CommandFinder() {
        possibleCommands.add(new AdditionCommand());
        possibleCommands.add(new ExitCommand());
        possibleCommands.add(new SubtractionCommand());
        possibleCommands.add(new MultiplicationCommand());
        possibleCommands.add(new DivisionCommand());
    }

    public AbstractCommand findCommand(String operator) {
        return possibleCommands.stream()
                .filter(abstractCommand -> abstractCommand.isSuitableInputOperator(operator))
                .findFirst()
                .orElse(null);
    }
}