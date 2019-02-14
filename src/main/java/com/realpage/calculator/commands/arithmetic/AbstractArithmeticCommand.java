package com.realpage.calculator.commands.arithmetic;

import com.realpage.calculator.commands.AbstractCommand;
import com.realpage.calculator.service.CommandRegistry;
import com.realpage.calculator.service.ExecutionContext;
import com.realpage.calculator.utils.Consoler;

import java.util.List;

import static com.realpage.calculator.utils.CollectionUtils.isNotEmpty;

public abstract class AbstractArithmeticCommand extends AbstractCommand {

    public AbstractArithmeticCommand(Consoler consoler, CommandRegistry commandRegistry) {
        super(consoler, commandRegistry);
    }

    protected abstract double calculateResult(double a, double b);

    @Override
    public void internalExecute(ExecutionContext executionContext) {
        List<Double> numbers = executionContext.getNumbers();
        double firstNumber = numbers.get(numbers.size() - 2);
        double secondNumber = numbers.get(numbers.size() - 1);
        double result = calculateResult(firstNumber, secondNumber);
        numbers.remove(numbers.size() - 1);
        numbers.remove(numbers.size() - 1);
        numbers.add(result);
        consoler.println(result);
    }

    @Override
    protected boolean validDataForExecution(ExecutionContext executionContext) {
        List<Double> numbers = executionContext.getNumbers();
        return ((isNotEmpty(numbers)) && (numbers.size() >= 2));
    }
}