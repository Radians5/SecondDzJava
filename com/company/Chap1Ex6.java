package com.company;

import java.math.BigInteger;

public class Chap1Ex6 {

    public BigInteger factorial(BigInteger num){
        if (num.compareTo(BigInteger.valueOf(1))==0)
            return BigInteger.valueOf(1);
        else
            return num.multiply(factorial(num.subtract(BigInteger.valueOf(1))));
    }
}
