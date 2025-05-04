package com.example.calculator.lv3;

import java.util.Scanner;

public class AppLv3 {
    public static void main(String[] args) {
        final ArithmeticCalculatorLv3 calculator = new ArithmeticCalculatorLv3();
        Scanner sc = new Scanner(System.in);
        while(true) {
            double number1 = 0.0, number2 = 0.0;
            System.out.print("첫 번째 숫자를 입력하세요: ");
            while(true) {
                if (sc.hasNextDouble()) {
                    number1 = sc.nextDouble();
                    if (number1 >= 0) break;
                } else sc.next();
                System.out.print("양의 정수를 입력해주세요: ");
            }
            System.out.print("두 번째 숫자를 입력하세요: ");
            while(true) {
                if (sc.hasNextInt()) {
                    number2 = sc.nextDouble();
                    if (number2 >= 0) break;
                } else sc.next();
                System.out.print("양의 정수를 입력해주세요: ");
            }

            System.out.print("사칙연산 기호를 입력해주세요: ");
            final char operator = sc.next().charAt(0);

            try {
                final Double result = calculator.calculate(number1, number2, operator);
                calculator.getResults().add(result);
                System.out.println("결과: " + result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.print("종료 하시겠습니까? (exit 입력시 종료): ");
            String cmd = sc.next();
            if (cmd.equals("exit")) break;
        }
    }
}
