package com.realpage.calculator.commands.common;

import com.realpage.calculator.commands.CommandType;
import com.realpage.calculator.service.ExecutionContext;
import com.realpage.calculator.utils.Consoler;

import static com.realpage.calculator.commands.CommandType.EXIT;

public class ExitCommand extends AbstractCommonCommand {

    public ExitCommand(Consoler consoler) {
        super(consoler);
    }

    @Override
    protected void internalExecute(ExecutionContext executionContext) {
        consoler.println("Exit. Bye");
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