package com.example.calculator.lv2;

import com.example.calculator.exception.DivideByZeroException;
import com.example.calculator.exception.InvalidOperatorException;

import java.util.LinkedList;
import java.util.List;

public class CalculatorLv2 {
    private List<Integer> results = new LinkedList<>();

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public void removeResult() {
        if (this.results.isEmpty()) return;
        this.results.remove(0);
    }

    public int calculate(int number1, int number2, char operator) {
        switch (operator) {
            case '+':
                return (number1 + number2);
            case '-':
                return (number1 - number2);
            case '*':
                return (number1 * number2);
            case '/':
                if (number2 == 0) throw new DivideByZeroException();
                else return (number1 / number2);
            default:
                throw new InvalidOperatorException(operator);
        }
    }
}
