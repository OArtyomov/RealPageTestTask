package com.realpage.calculator.commands.arithmetic;


import com.realpage.calculator.commands.CommandType;
import com.realpage.calculator.service.CommandRegistry;
import com.realpage.calculator.utils.Consoler;

import static com.realpage.calculator.commands.CommandType.ADD;

public class AdditionCommand extends AbstractArithmeticCommand {

    public AdditionCommand(Consoler consoler, CommandRegistry commandRegistry) {
        super(consoler, commandRegistry);
    }

    @Override
    protected double calculateResult(double a, double b) {
        return a + b;
    }

    @Override
    public CommandType getCommandType() {
        return ADD;
    }
}