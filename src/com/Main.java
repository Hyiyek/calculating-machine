package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 콘솔에 입력받는 스캐너 객체생성을 sc 에담는다

        // 클래스만든걸 객체생성
        Calculator calculator = new Calculator();

        while (true) {

            System.out.println("사칙연산으로 할것인가 원의 너비를 구할것인가?");
            String awd = sc.next();
            if(awd.equals("사칙연산")) {
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

            } else if(awd.equals("원의넓이")){
                System.out.print("원의 반지름을 입력하세요: ");
                int radius = sc.nextInt();

                // 2. 입력받은 radius를 괄호에 던져주고, 튕겨 나오는 넓이를 변수에 저장합니다!
                double area = calculator.calculateCircleArea(radius);

                // 3. 저장된 변수를 화면에 출력해 줍니다.
                System.out.println("원의 넓이 결과: " + area);
            }



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