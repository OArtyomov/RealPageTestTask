package com.realpage.calculator.service;

import com.realpage.calculator.commands.AbstractCommand;
import com.realpage.calculator.commands.arithmetic.AdditionCommand;
import com.realpage.calculator.commands.arithmetic.DivisionCommand;
import com.realpage.calculator.commands.arithmetic.MultiplicationCommand;
import com.realpage.calculator.commands.arithmetic.SubtractionCommand;
import com.realpage.calculator.commands.common.ExitCommand;
import com.realpage.calculator.utils.Consoler;

import java.util.ArrayList;
import java.util.List;

public class CommandFinder {
    private List<AbstractCommand> possibleCommands = new ArrayList<>();

    public CommandFinder(Consoler consoler) {
        possibleCommands.add(new AdditionCommand(consoler));
        possibleCommands.add(new ExitCommand(consoler));
        possibleCommands.add(new SubtractionCommand(consoler));
        possibleCommands.add(new MultiplicationCommand(consoler));
        possibleCommands.add(new DivisionCommand(consoler));
    }

    public AbstractCommand findCommand(String operator) {
        return possibleCommands.stream()
                .filter(abstractCommand -> abstractCommand.isSuitableInputOperator(operator))
                .findFirst()
                .orElse(null);
    }
}