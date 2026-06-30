package com;

public class ArithmeticCalculator extends Calculator {
    public double calculate(int num1, int num2, String n) {
        double box = 0;

        switch (n) {
            case "+":
                box = num1 + num2;
                break;
            case "-":
                box = num1 - num2;
                break;
            case "*":
                box = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 0이 될 수 없습니다.");
                    return 0;
                }
                box = (double) num1 / num2; // 소수점 계산을 위해 형변환
                break;
            case "%":
                if (num2 == 0) {
                    System.out.println("나머지 연산에서 0이 될 수 없습니다.");
                    return 0;
                }
                box = num1 % num2;
                break;
            default:
                throw new IllegalArgumentException("올바른 연산자가 아닙니다.");
        }

        // 부모에게 물려받은 protected 변수인 'results' 상자에 저장합니다!
        results.add(box);

        return box;
    }
}


