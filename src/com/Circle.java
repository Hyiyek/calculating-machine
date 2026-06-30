package com;


import java.util.ArrayList;
import java.util.List;

public class Circle  {
    private List<Double> circleResults;
    private static final double PI = 3.14;


    // 생성자 이름은 반드시 클래스 이름과 똑같이 'Circle'이어야 합니다
    public Circle() {
        this.circleResults = new ArrayList<>();
    }

    public double calculateCircleArea(int radius) {
        double area = radius * radius * PI;
        circleResults.add(area);
        return area;
    }
}
