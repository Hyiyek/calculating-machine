package com;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 사칙연산 결과를 담는 리스트 방
    protected List<Double> results;
    protected List<Double> circleResults;
    // 원의 너비 결과를 담는 리스트방




    public Calculator() {
        this.results = new ArrayList<>();
        this.circleResults = new ArrayList<>();

    }
    // 내 생성자를 객체를생성에서 담는다


    // 공통 기능: 삭제 (사칙연산 결과 삭제)
    public void removeResults() {
        if (!results.isEmpty()) {
            results.remove(0);
            System.out.println("삭제되었습니다");
        } else {
            System.out.println("삭제할 연산 결과가 없습니다");
        }
    }

    // 공통 기능: 조회 (사칙연산 결과 전체 조회)
    public void inquiryResults() {
        for (Double result : results) {
            System.out.println(result);
        }
    }

    // 원의 넓이 결과 조회 메서드도 여기에 공통으로 둡니다.
    public void inquiryCircleResults() {
        for (Double area : circleResults) {
            System.out.println(area);
        }
    }

    // Getter / Setter
    public List<Double> getResults() {
        return results;
    }

    public void setResults(List<Double> results) {
        this.results = results;
    }

    public List<Double> getCircleResults() {
        return circleResults;
    }

    public void setCircleResults(List<Double> circleResults) {
        this.circleResults = circleResults;
    }
}