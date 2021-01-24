package com.sunday.数组.丑数;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 编写一个程序，找出第 n 个丑数。
 *
 * 丑数就是质因数只包含 2, 3, 5 的正整数。
 */

public class demo {
    @Test
    public void test(){
        System.out.println(nthUglyNumber(10));
    }
    /**
     * 暴力解决法
    public int nthUglyNumber(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> indexList = new ArrayList<>();
        ArrayList<Integer> index2List=new ArrayList<>();
        list.add(1);
        for (int i = 2; i < 1690; i++) {
            if ((i%2%3%5==0||i%2%3==0||i%3%5==0||i%2%5==0||i%5==0)){
                list.add(i);
            }
        }
        for (int i = 2; i < 1690; i++) {
            if (!(i%2%3%5==0||i%2%3==0||i%3%5==0||i%2%5==0||i%5==0)){
                index2List.add(i);
            }
        }
        for (int i = 1; i < 1690; i++) {
            for (int y = 0; y < index2List.size(); y++) {
                if (i%(index2List.get(y))==0){
                    indexList.add(i);
                }
            }
        }
        for (int i = 0; i < indexList.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (indexList.contains(list.get(j))) {
                    list.remove(j);
                }
            }
        }
        return list.get(n-1);
    }
     */

    /**
     * 简便法
     * @param
     * @return
     */
    public int nthUglyNumber(int n){
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1; i < n; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if(dp[i] == n2) a++;
            if(dp[i] == n3) b++;
            if(dp[i] == n5) c++;
        }
        return dp[n - 1];
    }
}
