package com.realpage.calculator.commands.common;


import com.realpage.calculator.commands.AbstractCommand;
import com.realpage.calculator.service.ExecutionContext;

public abstract class AbstractCommonCommand extends AbstractCommand {
    @Override
    protected boolean validDataForExecution(ExecutionContext executionContext) {
        return true;
    }
}
