package com.realpage.calculator;


import com.realpage.calculator.commands.AbstractCommand;
import com.realpage.calculator.service.CommandFinder;

import java.util.Scanner;

public class Application {

    private static CommandFinder commandFinder = new CommandFinder();

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String operator = scanner.next();
            AbstractCommand command = commandFinder.findCommand(operator);
            if (command != null) {
                command.execute();
            } else {
                System.out.println("Command for execution not found");
            }
        }

    }
}