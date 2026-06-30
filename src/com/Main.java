package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 콘솔에 입력받는 스캐너 객체생성을 sc 에담는다

        // 클래스만든걸 객체생성
        Calculator calculator = new Calculator();

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("연산자를 입력하세요: ");
            String n = sc.next();

            if (!"+-*/%".contains(n)) {
                System.out.println("연산자가 일치하지 않습니다. 처음부터 다시 입력하세요.");
                continue;
            }

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            int box = calculator.calculate(num1, num2, n);
            System.out.println("결과: " + box);

            System.out.println("저장된 연산결과를 조회하시겠습니까?");
            String inquirycmd = sc.next();
            if(inquirycmd.equals("inquiry")){
                calculator.inquiryResults();
            }



            System.out.println("저장된 연산결과를 삭제하겠습니까?");
            String command = sc.next();
            if (command.equals("remove")){
                calculator.removeResults();
            }




            System.out.print("더 계산하시겠습니까?(exit 입력시 종료): ");
            String ans = sc.next();

            if (ans.equals("exit")) {
                System.out.println("계산기를 종료하겠습니다.");
                break;
            }
        }
    }
}