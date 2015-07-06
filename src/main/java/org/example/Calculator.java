package org.example;


import java.util.Arrays;
import java.util.List;

public class Calculator {


    public int subtract(String a, String b) {
        return Integer.valueOf(a) - Integer.valueOf(b);
    }

    public String nameOfFrodo(){
        return "Frodo";
    }

    public List<Point> returnPoints() {
        List<Point> pointsList;
        pointsList = Arrays.asList(new Point(1, 2), new Point(4, 5), new Point(0, 0));

        return pointsList;
    }

}
