package com.company;

import java.io.File;

public class Chap1Ex2 {
    public void prosent(int inNum) {
        System.out.println((int) (inNum * 57.2958) % 360);
    }

    public void mathFloor(int inNum) {
        System.out.println(Math.floorMod((int) (inNum * 57.2958), 360));
    }
}