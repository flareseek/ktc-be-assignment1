package com.example.calculator.lv3;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculatorLv3 {
    private List<Double> results = new LinkedList<>();

    public List<Double> getResults() {
        return results;
    }

    public void setResults(List<Double> results) {
        this.results = results;
    }

    public void removeResult() {
        if (this.results.isEmpty()) return;
        this.results.remove(0);
    }

    public <T extends Number> double calculate(T number1, T number2, char op) {
        OperatorType operatorType = OperatorType.parseOperatorType(op);
        return operatorType.calculate(number1, number2);
    }

    public List<Double> getResultsGreaterThan(double number) {
        return results.stream().filter((result) -> result > number).collect(Collectors.toList());
    }
}
