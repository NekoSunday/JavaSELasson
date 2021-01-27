package com.sunday.数组.盛最多水的容器;

import org.junit.Test;

/**
 * 盛最多水的容器
 *
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class demo {

    @Test
    public void test(){

    }

    /**
     * 自解，贼慢
     * @param height
     * @return
     */
    /*public int maxArea(int[] height) {
        int max=0;
        int index=0;
        for (int i = height.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                index=Math.min(height[i],height[j])*(i-j);
                max=Math.max(max,index);
            }
        }
        return max;
    }*/

    /**
     * 最优解，容易理解
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int maxArea = 0 ;
        for ( int i = 0 , j = height.length - 1 ; i < j ; ) {
            int min = height[i] > height[j] ? height[j--] : height[i++] ;
            int max = (( j - i + 1) * min) ;
            if ( maxArea < max ) {
                maxArea = max ;
            }
        }
        return maxArea;
    }
}
