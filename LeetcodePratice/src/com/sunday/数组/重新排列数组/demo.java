package com.sunday.数组.重新排列数组;

import org.junit.Test;

import java.util.Arrays;

/**
 * 重新排列数组
 *
 * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 *
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shuffle-the-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class demo {

    @Test
    public void test(){
        int[] nums={2,5,1,3,4,7};
        shuffle(nums,3);
    }

    public int[] shuffle(int[] nums, int n) {
        int[] Xnums = new int[n];
        int[] Ynums=new int[n];
        System.arraycopy(nums,0,Xnums,0,n);
        System.arraycopy(nums,n,Ynums,0,n);
        int x=0;
        int y=0;
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0){
                nums[i]=Xnums[x++];
            }else{
                nums[i]=Ynums[y++];
            }
        }


        return nums;
    }
}
