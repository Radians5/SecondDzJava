package com.company;

public class Chap1Ex1 {
    public void binaryTranslation(int num) {
        System.out.println(Integer.toBinaryString(num));
    }

    public void octalTranslation(int num) {
        System.out.println(Integer.toOctalString(num));
    }

    public void hexTranslation(int num) {
        System.out.println(Integer.toHexString(num));
    }

    public void invertHex(int num) {
        System.out.println(Integer.toHexString(~num));
    }


}
