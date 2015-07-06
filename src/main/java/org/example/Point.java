package org.example;

public class Point {

    private int x;
    private int y;
    public String id;

    public Point() {
        id = "bitch_point";
    }

    public Point(int x, int y) {
        this();
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Point parameterCastedToPoint = (Point) obj;
        return this.x == parameterCastedToPoint.x
                && this.y == parameterCastedToPoint.y ? true : false;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
