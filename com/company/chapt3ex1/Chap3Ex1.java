package com.company.chapt3ex1;

import com.company.chap3ex2.MeasurableNew;

public class Chap3Ex1 implements MeasurableNew {
    private double salary = 0;
    private double maxSalary = 0;

    @Override
    public double getMeasurable() {
        return this.salary;
    }

    @Override
    public double MaxSalary(MeasurableNew... salary) {
        for (MeasurableNew maxNum : salary
        ) {
            if (maxSalary < maxNum.getMeasurable())
                maxSalary = maxNum.getMeasurable();
        }
        return maxSalary;
    }

}
