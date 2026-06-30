package com;

public class ArithmeticCalculator extends Calculator {


    private final AddOperator addOperator;
    private final DivideOperator divideOperator;
    private final MultiplyOperator multiplyOperator;
    private final SubtractOperator subtractOperator;

    //  2. 생성자도 메서드 바깥으로 독립시킵니다!
    public ArithmeticCalculator() {
        this.addOperator = new AddOperator();
        this.divideOperator = new DivideOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.subtractOperator = new SubtractOperator();
    }


    public double calculate(int num1, int num2, String n) {
        double box = 0;

        switch (n) {
            case "+":

                box = addOperator.operate(num1, num2);
                break;
            case "-":
                box = divideOperator.operate(num1,num2);
                break;
            case "*":
                box = multiplyOperator.operate(num1,num2);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 0이 될 수 없습니다.");
                    return 0;
                }
                box = subtractOperator.operate(num1,num2);
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


        results.add(box);

        return box;
    }
}