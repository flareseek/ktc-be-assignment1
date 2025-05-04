package com.example.calculator.exception;

public class DivideByZeroException extends RuntimeException {
    public DivideByZeroException() {
        super("분모에 0을 입력할 수 없습니다.");
    }
}
