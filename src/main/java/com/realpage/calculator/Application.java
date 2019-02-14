package com.realpage.calculator;


import com.realpage.calculator.commands.AbstractCommand;
import com.realpage.calculator.service.CommandFinder;
import com.realpage.calculator.service.ExecutionContext;

import java.util.Scanner;

import static com.realpage.calculator.utils.StringUtils.isDouble;
import static java.lang.Double.parseDouble;

public class Application {

    private static CommandFinder commandFinder = new CommandFinder();

    private static ExecutionContext executionContext = new ExecutionContext();

    public static void main(String[] args) {
        while (true) {
            System.out.print(">");
            Scanner scanner = new Scanner(System.in);
            String inputValue = scanner.next();
            AbstractCommand command = commandFinder.findCommand(inputValue);
            if (command != null) {
                command.execute(executionContext);
            } else {
                boolean isData = isDouble(inputValue);
                if (isData) {
                    executionContext.addNumber(parseDouble(inputValue));
                    System.out.println(inputValue);
                } else {
                    System.out.println("Command for execution not found or data is invalid");
                }
            }
        }

    }

}