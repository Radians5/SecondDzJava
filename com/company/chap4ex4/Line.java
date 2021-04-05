package com.company.chap4ex4;

import java.awt.*;

public class Line extends Shape {
    Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point((to.getX() - getPoint().getX()) / 2, (to.getY() - getPoint().getY() / 2));
    }

    public Line clone() throws CloneNotSupportedException {
        Line cloneLine = (Line) super.clone();
        cloneLine.to = this.to;

        return cloneLine;
    }
}
