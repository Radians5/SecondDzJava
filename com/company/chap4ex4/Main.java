package com.company.chap4ex4;

public class Main {
    public static void main(String args[]) {
        Line line = new Line(new Point(1, 2), new Point(1, 5));
        try {
            line.clone().getCenter();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
