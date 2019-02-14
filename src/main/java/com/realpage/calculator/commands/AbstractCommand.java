package com.realpage.calculator.commands;

public abstract class AbstractCommand {


    public abstract void execute();

    public abstract CommandType getCommandType();

    public abstract boolean isSuitableInputOperator(String operator);
}