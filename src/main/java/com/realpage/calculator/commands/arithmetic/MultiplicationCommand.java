package com.realpage.calculator.commands.arithmetic;

import com.realpage.calculator.commands.CommandType;
import com.realpage.calculator.utils.Consoler;

public class MultiplicationCommand extends AbstractArithmeticCommand {

    public MultiplicationCommand(Consoler consoler) {
        super(consoler);
    }

    @Override
    protected double calculateResult(double a, double b) {
        return a * b;
    }

    @Override
    public CommandType getCommandType() {
        return CommandType.MULTIPLE;
    }

    @Override
    public boolean isSuitableInputOperator(String operator) {
        return "*".equals(operator);
    }
}