package com.company.chap4ex4;

abstract public class Shape implements Cloneable {
    private Point point;

    public void moveBy(double dx, double dy) {
        point.x += dx;
        point.y += dy;
    }

    abstract public Point getCenter();

    public Point getPoint() {
        return point;
    }

    public Shape(Point point) {
        this.point = point;
    }
}
