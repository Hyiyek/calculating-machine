package com;

import java.util.ArrayList;
import java.util.List;

public class Calculator {


    private List<Integer> results;

    public Calculator(){
        this.results = new ArrayList<>();
    }

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
                throw new IllegalArgumentException("올바른 연산자가 아닙니다.");
        }

        
        results.add(box);

        return box;
    }

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer>results){
        this.results = results;
    }

    public void removeResults(){
        if(!results.isEmpty()){
            results.remove(0);
            System.out.println("삭제되었습니다");
        }
        else{
            System.out.println("삭제할 연산 결과가없습니다");
        }
    }

    public void inquiryResults(){
        for (Integer result : results) {
            System.out.println(result);

        }
    }


}