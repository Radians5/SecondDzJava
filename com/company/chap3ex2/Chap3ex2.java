package com.company.chap3ex2;

import com.company.chapt3ex1.Measurable;

public class Chap3ex2 implements com.company.chapt3ex1.Measurable {
    private double salary = 0;
    private double averSalay = 0;

    @Override
    public double getMeasurable() {
        return this.salary;
    }

    @Override
    public double averageSalary(com.company.chapt3ex1.Measurable... salary) {
        for (Measurable calculation : salary) {
            averSalay += calculation.getMeasurable();
        }
        return averSalay;
    }
}
