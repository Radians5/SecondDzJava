package com.company.chap4ex4;

import java.awt.*;

public class Circle extends Shape {
    double radius;

    public Circle(Point center, double radius) {

        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return getPoint();
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        Circle circleClone = (Circle) super.clone();
        circleClone.radius = this.radius;
        return circleClone;
    }
}
