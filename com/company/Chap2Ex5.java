package com.company;

class Point {
    private double x;
    private double y;

    public Point() {
        x = 0.0;
        y = 0.0;

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void translate(double x, double y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public void scale(double scale) {
        this.x = this.x * scale;
        this.y = this.y * scale;
    }
}