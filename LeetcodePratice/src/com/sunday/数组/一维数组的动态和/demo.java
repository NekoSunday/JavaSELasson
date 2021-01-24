package com.sunday.数组.一维数组的动态和;

import org.junit.Test;

import java.util.Arrays;

public class demo {
    /**
     *给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
     *
     * 请返回 nums 的动态和。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/running-sum-of-1d-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    @Test
    public void test(){
        int[] nums={1,5,9,3,0,3};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public int[] runningSum(int[] nums) {
        if (nums.length<2){
            return nums;
        }
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        return nums;
    }


}
