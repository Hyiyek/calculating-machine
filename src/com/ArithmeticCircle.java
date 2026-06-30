package com;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCircle extends Calculator{
    protected List<Double> circleResults;
    private static final double PI = 3.14;
    

    public double calculateCircleArea(int radius) {
        double area = radius * radius * PI;
        circleResults.add(area);
        return area;
    }
}

