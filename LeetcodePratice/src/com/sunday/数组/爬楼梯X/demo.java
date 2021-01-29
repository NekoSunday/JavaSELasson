package com.sunday.数组.爬楼梯X;

import org.junit.Test;

public class demo {

    @Test
    public void test() {

    }

    public int climbStairs(int n) {
        double sqrt5 = Math.sqrt(5);
        double fibn = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);
        return (int) Math.round(fibn / sqrt5);
    }
}




