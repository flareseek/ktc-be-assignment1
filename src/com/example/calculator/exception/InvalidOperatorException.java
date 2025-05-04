package com.example.calculator.exception;

public class InvalidOperatorException extends RuntimeException {
    public InvalidOperatorException(char operator) {
        super("사칙연산 기호 (+, -, *, /)를 입력해주세요. ('" + operator + "')");
    }
}
