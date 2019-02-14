package com.realpage.calculator.commands.arithmetic;

import com.realpage.calculator.commands.CommandType;
import com.realpage.calculator.service.CommandRegistry;
import com.realpage.calculator.service.ExecutionContext;
import com.realpage.calculator.utils.Consoler;

import java.math.BigDecimal;
import java.util.List;

import static java.math.BigDecimal.ZERO;

public class DivisionCommand extends AbstractArithmeticCommand {

    public DivisionCommand(Consoler consoler, CommandRegistry commandRegistry) {
        super(consoler, commandRegistry);
    }

    @Override
    protected double calculateResult(double a, double b) {
        return a / b;
    }

    @Override
    public CommandType getCommandType() {
        return CommandType.DEVIDE;
    }

    @Override
    protected boolean validDataForExecution(ExecutionContext executionContext) {
        if (super.validDataForExecution(executionContext)) {
            List<Double> numbers = executionContext.getNumbers();
            Double lastNumber = numbers.get(numbers.size() - 1);
            return ZERO.compareTo(BigDecimal.valueOf(lastNumber)) != 0;
        }
        return false;
    }
}