package com.realpage.calculator.commands.common;


import com.realpage.calculator.commands.AbstractCommand;
import com.realpage.calculator.service.ExecutionContext;
import com.realpage.calculator.utils.Consoler;

public abstract class AbstractCommonCommand extends AbstractCommand {
    public AbstractCommonCommand(Consoler consoler) {
        super(consoler);
    }

    @Override
    protected boolean validDataForExecution(ExecutionContext executionContext) {
        return true;
    }
}
