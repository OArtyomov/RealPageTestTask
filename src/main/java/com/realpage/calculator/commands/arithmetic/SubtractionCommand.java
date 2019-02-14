package com.realpage.calculator.commands.arithmetic;

import com.realpage.calculator.commands.CommandType;
import com.realpage.calculator.utils.Consoler;

public class SubtractionCommand extends AbstractArithmeticCommand {


    public SubtractionCommand(Consoler consoler) {
        super(consoler);
    }

    @Override
    protected double calculateResult(double a, double b) {
        return a - b;
    }

    @Override
    public CommandType getCommandType() {
        return CommandType.MINUS;
    }

    @Override
    public boolean isSuitableInputOperator(String operator) {
        return "-".equals(operator);
    }
}