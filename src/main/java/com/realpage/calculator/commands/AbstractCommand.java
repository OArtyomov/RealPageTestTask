package com.realpage.calculator.commands;

import com.realpage.calculator.service.CommandRegistry;
import com.realpage.calculator.service.ExecutionContext;
import com.realpage.calculator.utils.Consoler;

public abstract class AbstractCommand {
    protected final Consoler consoler;

    protected final CommandRegistry commandRegistry;

    public AbstractCommand(Consoler consoler, CommandRegistry commandRegistry) {
        this.consoler = consoler;
        this.commandRegistry = commandRegistry;
    }

    protected abstract void internalExecute(ExecutionContext executionContext);

    public final void execute(ExecutionContext executionContext) {
        if (validDataForExecution(executionContext)) {
            internalExecute(executionContext);
        } else {
            consoler.println("Not enough data for execution or data is invalid");
        }
    }

    protected abstract boolean validDataForExecution(ExecutionContext executionContext);

    public abstract CommandType getCommandType();

    public final String getOperator(){
        return getCommandType().getOperator();
    }

    public boolean isSuitableInputOperator(String operator) {
        return getOperator().equals(operator);
    }
}