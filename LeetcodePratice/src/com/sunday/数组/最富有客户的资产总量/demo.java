package com.sunday.数组.最富有客户的资产总量;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class demo {

    @Test
    public void test(){
        int[][] accounts=new int[][]{{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }


    public int maximumWealth(int[][] accounts) {
        HashMap<Integer, int[]> map = new HashMap<>();
        int max=0;
        int index;
        for (int i = 0; i < accounts.length; i++) {
            map.put(i,accounts[i]);
        }
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            index=0;
            for (int i : map.get(integer)) {
                index+=i;
            }
            max=Math.max(max,index);
        }
        return max;
    }
}
