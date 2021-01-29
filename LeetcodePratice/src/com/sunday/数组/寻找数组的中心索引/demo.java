package com.sunday.数组.寻找数组的中心索引;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 寻找数组的中心索引
 *
 * 给定一个整数类型的数组 nums，请编写一个能够返回数组 “中心索引” 的方法。
 *
 * 我们是这样定义数组 中心索引 的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 *
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-pivot-index
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class demo {

    @Test
    public void test(){
        pivotIndex(new int[]{-1,-1,0,-1,-1,0});
    }

    public int pivotIndex(int[] nums) {
        if(nums==null||nums.length==0){
            return -1;
        }
        int left=0,right=0;
        for(int num:nums){
            right+=num;
        }
        right-=nums[0];
        if(right==left){
            return 0;
        }
        for(int i=1,length=nums.length;i<length;i++){
            right-=nums[i];
            left+=nums[i-1];
            if(right==left){
                return i;
            }
        }
        return -1;
    }
}
