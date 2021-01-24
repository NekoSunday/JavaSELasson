package com.sunday.数组.最长连续递增序列;

import org.junit.Test;

public class demo {

    /**
     * 给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。
     */
    @Test
    public void test() {
        int nums1[] = {1, 3, 5, 4, 8, 9, 10, 11};
        int nums2[] = {2, 2, 2, 2, 2};
        int nums3[] = new int[0];
        System.out.println(findLengthOfLCIS(nums1));
    }

    public int findLengthOfLCIS(int[] nums) {
        if(nums.length <= 1)
            return nums.length;
        int ans = 1;
        int count = 1;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i+1] > nums[i]) {
                count++;
            } else {
                count = 1;
            }
            ans = Math.max(count, ans);
        }
        return ans;
    }
}
