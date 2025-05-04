package com.example.calculator.lv1;

import com.example.calculator.exception.DivideByZeroException;
import com.example.calculator.exception.InvalidOperatorException;

import java.util.Scanner;

public class AppLv1 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        while(true) {
            int number1 = 0, number2 = 0;
            System.out.print("첫 번째 숫자를 입력하세요: ");
            while(true) {
                if (sc.hasNextInt()) {
                    number1 = sc.nextInt();
                    if (number1 >= 0) break;
                } else sc.next();
                System.out.print("양의 정수를 입력해주세요: ");
            }
            System.out.print("두 번째 숫자를 입력하세요: ");
            while(true) {
                if (sc.hasNextInt()) {
                    number2 = sc.nextInt();
                    if (number2 >= 0) break;
                } else sc.next();
                System.out.print("양의 정수를 입력해주세요: ");
            }

            System.out.print("사칙연산 기호를 입력하세요: ");
            final char operator = sc.next().charAt(0);
            int result = 0;
            try {
                switch (operator) {
                    case '+':
                        result = number1 + number2;
                        break;
                    case '-':
                        result = number1 - number2;
                        break;
                    case '*':
                        result = number1 * number2;
                        break;
                    case '/':
                        if (number2 == 0) throw new DivideByZeroException();
                        else result = number1 / number2;
                        break;
                    default:
                        throw new InvalidOperatorException(operator);
                }
                System.out.println("결과: " + result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            final String cmd = sc.next();
            if (cmd.equals("exit")) break;
        }
    }
}
