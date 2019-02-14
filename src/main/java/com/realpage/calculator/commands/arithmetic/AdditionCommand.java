package com.realpage.calculator.commands.arithmetic;


import com.realpage.calculator.commands.CommandType;
import com.realpage.calculator.utils.Consoler;

import static com.realpage.calculator.commands.CommandType.ADD;

public class AdditionCommand extends AbstractArithmeticCommand {

    public AdditionCommand(Consoler consoler) {
        super(consoler);
    }

    @Override
    protected double calculateResult(double a, double b) {
        return a + b;
    }

    @Override
    public CommandType getCommandType() {
        return ADD;
    }

    @Override
    public boolean isSuitableInputOperator(String operator) {
        return "+".equals(operator);
    }
}