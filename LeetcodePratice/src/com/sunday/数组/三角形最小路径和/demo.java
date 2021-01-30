package com.sunday.数组.三角形最小路径和;

import org.junit.Test;

import java.util.ArrayList;
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
        if (triangle.size()==1){
            return triangle.get(0).get(0);
        }
        int size = triangle.size();
        int getindex=0;
        int sum=Integer.MAX_VALUE;
        int index=Integer.MAX_VALUE;
        int indexSum=0;
        for (int i = 1; i < size; i++) {
            List<Integer> indexList = triangle.get(i);
            for (int j =getindex; j <= getindex+1; j++) {
                index=Math.min(index,indexList.get(j));
            }
            getindex = indexList.indexOf(index);
            indexSum+=index;
        }
        return sum;
    }
}
