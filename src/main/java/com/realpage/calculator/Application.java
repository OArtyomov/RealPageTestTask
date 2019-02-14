package com.realpage.calculator;


import com.realpage.calculator.commands.AbstractCommand;
import com.realpage.calculator.service.CommandFinder;
import com.realpage.calculator.service.ExecutionContext;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Application {

    private static CommandFinder commandFinder = new CommandFinder();

    private static ExecutionContext executionContext = new ExecutionContext();

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String operator = scanner.next();
            AbstractCommand command = commandFinder.findCommand(operator);
            if (command != null) {
                command.execute(executionContext);
            } else {
                boolean isData = checkIfData(operator);
                if (isData) {
                    executionContext.addNumber(Double.parseDouble(operator));
                } else {
                    System.out.println("Command for execution not found or data is invalid");
                }
            }
        }

    }

    private static boolean checkIfData(String inputValue) {
        if (StringUtils.isNotEmpty(inputValue)) {
            try {
                Double.parseDouble(inputValue);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        }
        return false;
    }
}