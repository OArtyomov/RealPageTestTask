package com.realpage.calculator.commands.common;

import com.realpage.calculator.commands.CommandType;
import com.realpage.calculator.service.ExecutionContext;

import static com.realpage.calculator.commands.CommandType.EXIT;

public class ExitCommand extends AbstractCommonCommand {

    @Override
    protected void internalExecute(ExecutionContext executionContext) {
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