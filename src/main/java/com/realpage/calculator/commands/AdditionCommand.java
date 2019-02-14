package com.realpage.calculator.commands;


import static com.realpage.calculator.commands.CommandType.ADD;

public class AdditionCommand extends AbstractCommand {

    @Override
    public void execute() {
        System.out.println("Execute add operation");
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