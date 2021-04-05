package com.company;

class Car {
    private double x0 = 0;
    private double xRes = 0;
    private double fullComp = 0;
    private double fuelEc = 0;

    public void fuelEc(int fuelEc) {
        this.fuelEc = fuelEc;
    }

    public double restOfTheWay() {
        double restWay = 0;
        restWay = this.fullComp / fuelEc * 100;
        return restWay;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Distance" + currentDist() +
                ", fullComp=" + fullComp +
                ", fuelEc=" + fuelEc +
                '}';
    }

    public double refuel(double gas) {
        this.fullComp = this.fullComp + gas;
        return this.restOfTheWay();
    }

    public double currentDist() {
        return this.xRes - x0;
    }

    public double Gas() {
        return this.fullComp;
    }

}
