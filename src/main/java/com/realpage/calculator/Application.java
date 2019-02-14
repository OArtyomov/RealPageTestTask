package com.realpage.calculator;


import com.realpage.calculator.commands.AbstractCommand;
import com.realpage.calculator.service.CommandRegistry;
import com.realpage.calculator.service.ExecutionContext;
import com.realpage.calculator.utils.Consoler;

import java.util.Scanner;

import static com.realpage.calculator.utils.StringUtils.isDouble;
import static java.lang.Double.parseDouble;

public class Application {

    private static Consoler consoler = new Consoler();

    private static CommandRegistry commandFinder = new CommandRegistry(consoler);

    private static ExecutionContext executionContext = new ExecutionContext();


    public static void main(String[] args) {
        while (true) {
            consoler.print(">");
            Scanner scanner = new Scanner(System.in);
            String inputValue = scanner.next();
            AbstractCommand command = commandFinder.findCommand(inputValue);
            if (command != null) {
                command.execute(executionContext);
            } else {
                boolean isData = isDouble(inputValue);
                if (isData) {
                    executionContext.addNumber(parseDouble(inputValue));
                    consoler.println(inputValue);
                } else {
                    consoler.println("Command for execution not found or data is invalid");
                }
            }
        }

    }

}