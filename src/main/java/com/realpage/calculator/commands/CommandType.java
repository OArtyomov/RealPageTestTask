package com.realpage.calculator.commands;

import static com.realpage.calculator.utils.Constants.DIVISION_OPERATION_DESCRIPTION;
import static com.realpage.calculator.utils.Constants.DIVISION_OPERATOR;
import static com.realpage.calculator.utils.Constants.EXIT_COMMAND;
import static com.realpage.calculator.utils.Constants.EXIT_COMMAND_DESCRIPTION;
import static com.realpage.calculator.utils.Constants.HELP_COMMAND;
import static com.realpage.calculator.utils.Constants.HELP_COMMAND_DESCRIPTION;
import static com.realpage.calculator.utils.Constants.MINUS_OPERATION_DESCRIPTION;
import static com.realpage.calculator.utils.Constants.MINUS_OPERATOR;
import static com.realpage.calculator.utils.Constants.MULTIPLICATION_OPERATION_DESCRIPTION;
import static com.realpage.calculator.utils.Constants.MULTIPLICATION_OPERATOR;
import static com.realpage.calculator.utils.Constants.PLUS_OPERATION_DESCRIPTION;
import static com.realpage.calculator.utils.Constants.PLUS_OPERATOR;

public enum CommandType {
    ADD(PLUS_OPERATOR, PLUS_OPERATION_DESCRIPTION),
    MINUS(MINUS_OPERATOR, MINUS_OPERATION_DESCRIPTION),
    DEVIDE(DIVISION_OPERATOR, DIVISION_OPERATION_DESCRIPTION),
    MULTIPLE(MULTIPLICATION_OPERATOR, MULTIPLICATION_OPERATION_DESCRIPTION),
    EXIT(EXIT_COMMAND, EXIT_COMMAND_DESCRIPTION),
    HELP(HELP_COMMAND, HELP_COMMAND_DESCRIPTION);


    private final String operator;

    private final String description;

    public String getOperator() {
        return operator;
    }

    public String getDescription() {
        return description;
    }

    CommandType(String operator, String description) {
        this.operator = operator;
        this.description = description;
    }
}