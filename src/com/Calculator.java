package com;

public class Calculator {

    public int calculate(int num1, int num2, String n) {

        int box = 0;

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
                box = num1 / num2;
                break;

            case "%":
                if (num2 == 0) {
                    System.out.println("나머지 연산에서 0이 될 수 없습니다.");
                    return 0;
                }
                box = num1 % num2;
                break;

            default:
                System.out.println("연산자가 일치하지 않습니다.");
        }

        return box;
    }
}