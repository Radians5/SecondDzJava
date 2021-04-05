package com.company.chap4ex4;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(getPoint().getX() + width / 2, getPoint().getY() + height / 2);
    }

    public Rectangle clone() throws CloneNotSupportedException {
        Rectangle cloneRec = (Rectangle) super.clone();
        cloneRec.height = this.height;
        cloneRec.width = this.width;
        return cloneRec;
    }
}
