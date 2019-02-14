package com.realpage.calculator.commands;

import static com.realpage.calculator.commands.CommandType.EXIT;

public class ExitCommand extends AbstractCommand {
    @Override
    public void execute() {
        System.out.println("Exit. Bye");
        System.exit(0);
    }

    @Override
    public CommandType getCommandType() {
        return EXIT;
    }

    @Override
    public boolean isSuitableInputOperator(String operator) {
        return "q".equals(operator);
    }
}