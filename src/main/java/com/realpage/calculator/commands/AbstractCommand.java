package com.realpage.calculator.commands;

import com.realpage.calculator.service.ExecutionContext;

public abstract class AbstractCommand {

    protected abstract void internalExecute(ExecutionContext executionContext);

    public final void execute(ExecutionContext executionContext) {
        if (validDataForExecution(executionContext)) {
            internalExecute(executionContext);
        } else {
            System.out.println("Not enough data for execution or data is invalid");
        }
    }

    protected abstract boolean validDataForExecution(ExecutionContext executionContext);

    public abstract CommandType getCommandType();

    public abstract boolean isSuitableInputOperator(String operator);
}