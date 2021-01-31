package com.sunday.数组.三角形最小路径和X;

import org.junit.Test;

import java.util.List;

/**
 * 三角形最小路径和
 *
 * 每一步只能移动到下一行中相邻的结点上。相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 * 也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class demo {

    @Test
    public void test() {

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle==null || triangle.size()==0) {
            return 0;
        }
        int n = triangle.size();
        int m = triangle.get(n-1).size();
        //申请的dp数组为最长列+1
        int[] dp = new int[m+1];
        for(int i=n-1;i>=0;--i) {
            //从左到右的方式计算
            for(int j=0;j<triangle.get(i).size();++j) {
                dp[j] = Math.min(dp[j],dp[j+1]) + triangle.get(i).get(j);
            }
        }
        //dp数组的第一个元素即为最终结果
        return dp[0];
    }
}
