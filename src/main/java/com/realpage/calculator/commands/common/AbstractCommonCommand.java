package com.realpage.calculator.commands.common;


import com.realpage.calculator.commands.AbstractCommand;
import com.realpage.calculator.service.CommandRegistry;
import com.realpage.calculator.service.ExecutionContext;
import com.realpage.calculator.utils.Consoler;

public abstract class AbstractCommonCommand extends AbstractCommand {
    public AbstractCommonCommand(Consoler consoler, CommandRegistry commandRegistry) {
        super(consoler, commandRegistry);
    }

    @Override
    protected boolean validDataForExecution(ExecutionContext executionContext) {
        return true;
    }
}
