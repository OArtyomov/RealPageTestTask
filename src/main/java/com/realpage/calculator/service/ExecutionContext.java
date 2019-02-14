package com.realpage.calculator.service;

import java.util.ArrayList;
import java.util.List;

public class ExecutionContext {

    private List<Double> numbers = new ArrayList<>();

    public List<Double> getNumbers() {
        return numbers;
    }

    public void addNumber(Double number) {
        numbers.add(number);
    }
}
