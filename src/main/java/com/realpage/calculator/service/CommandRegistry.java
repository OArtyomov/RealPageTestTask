package com.realpage.calculator.service;

import com.realpage.calculator.commands.AbstractCommand;
import com.realpage.calculator.commands.arithmetic.AdditionCommand;
import com.realpage.calculator.commands.arithmetic.DivisionCommand;
import com.realpage.calculator.commands.arithmetic.MultiplicationCommand;
import com.realpage.calculator.commands.arithmetic.SubtractionCommand;
import com.realpage.calculator.commands.common.ExitCommand;
import com.realpage.calculator.commands.common.HelpCommand;
import com.realpage.calculator.utils.Consoler;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class CommandRegistry {
    private List<AbstractCommand> possibleCommands = new ArrayList<>();

    public CommandRegistry(Consoler consoler) {
        possibleCommands.add(new AdditionCommand(consoler, this));
        possibleCommands.add(new ExitCommand(consoler, this));
        possibleCommands.add(new SubtractionCommand(consoler, this));
        possibleCommands.add(new MultiplicationCommand(consoler, this));
        possibleCommands.add(new DivisionCommand(consoler, this));
        possibleCommands.add(new HelpCommand(consoler, this));
    }

    public AbstractCommand findCommand(String operator) {
        return possibleCommands.stream()
                .filter(abstractCommand -> abstractCommand.isSuitableInputOperator(operator))
                .findFirst()
                .orElse(null);
    }

    public List<AbstractCommand> getPossibleCommands() {
        return unmodifiableList(possibleCommands);
    }
}