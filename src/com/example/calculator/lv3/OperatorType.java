package com.example.calculator.lv3;

import com.example.calculator.exception.DivideByZeroException;
import com.example.calculator.exception.InvalidOperatorException;

public enum OperatorType {
    ADD((n1, n2) -> n1.doubleValue() + n2.doubleValue()),
    SUBTRACT((n1, n2) -> n1.doubleValue() - n2.doubleValue()),
    MULTIPLY((n1, n2) -> n1.doubleValue() * n2.doubleValue()),
    DIVIDE((n1, n2) -> {
        if (n2.doubleValue() == 0) throw new DivideByZeroException();
       return n1.doubleValue() / n2.doubleValue();
    }),;

    @FunctionalInterface
    interface Operation {
        Double operation(Number a, Number b);
    }

    private final Operation op;
    OperatorType(Operation operation) {
        this.op = operation;
    }

    public double calculate(Number a, Number b) {
        return op.operation(a, b);
    }

    public static OperatorType parseOperatorType(char operator) {
        switch (operator) {
            case '+':
                return ADD;
            case '-':
                return SUBTRACT;
            case '*':
                return MULTIPLY;
            case '/':
                return DIVIDE;
            default:
                throw new InvalidOperatorException(operator);
        }
    }
}

