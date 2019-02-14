package com.realpage.calculator.commands.common;


import com.realpage.calculator.commands.AbstractCommand;
import com.realpage.calculator.commands.CommandType;
import com.realpage.calculator.service.CommandRegistry;
import com.realpage.calculator.service.ExecutionContext;
import com.realpage.calculator.utils.Consoler;

import java.util.List;

import static com.realpage.calculator.commands.CommandType.HELP;
import static com.realpage.calculator.utils.CollectionUtils.isNotEmpty;

public class HelpCommand extends AbstractCommonCommand {

    public HelpCommand(Consoler consoler, CommandRegistry commandRegistry) {
        super(consoler, commandRegistry);
    }

    @Override
    protected void internalExecute(ExecutionContext executionContext) {
        List<AbstractCommand> possibleCommands = commandRegistry.getPossibleCommands();
        if (isNotEmpty(possibleCommands)) {
            possibleCommands.forEach(this::printInfoAboutCommand);
        }
    }

    private void printInfoAboutCommand(AbstractCommand abstractCommand) {
        CommandType commandType = abstractCommand.getCommandType();
        String resultString = commandType.getOperator() + " -- " + commandType.getDescription();
        consoler.println(resultString);
    }

    @Override
    public CommandType getCommandType() {
        return HELP;
    }

}