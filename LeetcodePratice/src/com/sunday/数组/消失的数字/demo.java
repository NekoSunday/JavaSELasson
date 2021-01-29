package com.sunday.数组.消失的数字;

import org.junit.Test;

/**
 * 消失的数字
 *
 * 数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？
 */

public class demo {

    @Test
    public void test(){

    }

    public int missingNumber(int[] nums) {
        int length=nums.length;
        int sum=length*(length+1)/2;
        for (int i = 0; i < length; i++) {
            sum-=nums[i];
        }
        return sum;
    }
}
