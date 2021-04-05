package com.company;

public class Chap1Ex3 {
    public void condOp(int one, int two, int three) {
        int maxNum = 0;
        if (one > two) maxNum = one;
        else maxNum = two;
        if (maxNum > three) System.out.println(maxNum);
        else System.out.println(three);

    }

    public void math(int one, int two, int three) {
        System.out.println(Math.max(Math.max(one, two), three));
    }
}
