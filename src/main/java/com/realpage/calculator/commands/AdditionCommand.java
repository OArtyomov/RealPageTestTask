package com.realpage.calculator.commands;


import com.realpage.calculator.service.ExecutionContext;

import java.util.List;

import static com.realpage.calculator.commands.CommandType.ADD;
import static org.apache.commons.collections.CollectionUtils.isNotEmpty;

public class AdditionCommand extends AbstractCommand {

    @Override
    public void internalExecute(ExecutionContext executionContext) {
        System.out.println("Execute add operation");
        List<Double> numbers = executionContext.getNumbers();
        double firstNumber = numbers.get(numbers.size() - 1);
        double secondNumber = numbers.get(numbers.size() - 2);
        double result = firstNumber + secondNumber;
        numbers.remove(numbers.size() - 1);
        numbers.remove(numbers.size() - 1);
        numbers.add(result);
        System.out.println("Result: " + result);
    }

    @Override
    protected boolean validDataForExecution(ExecutionContext executionContext) {
        List<Double> numbers = executionContext.getNumbers();
        return ((isNotEmpty(numbers)) && (numbers.size() >= 2));
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