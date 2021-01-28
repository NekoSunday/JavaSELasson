package com.sunday.数组.有效的山脉数组;

import org.junit.Test;

import java.util.Arrays;

/**
 * 有效的山脉数组
 *
 * 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 *
 * 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
 *
 * A.length >= 3
 * 在 0 < i < A.length - 1 条件下，存在 i 使得：
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-mountain-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class demo {

    @Test
    public void test(){
        int[] arr={3,5,5};
        validMountainArray(arr);
    }

    /*public boolean validMountainArray(int[] arr) {
        if (arr.length<=2){
            return false;
        }
        int max=0;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        if(index==arr.length-1||index==0){
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (arr[i]>=arr[i+1]){
                return false;
            }
        }
        for (int i = index; i < arr.length-1; i++) {
            if (arr[i]<=arr[i+1]){
                return false;
            }
        }
        return true;
    }*/

    public boolean validMountainArray(int[] arr) {
        int length=arr.length;
        if (length<=2){
            return false;
        }
        int left=0;
        int right=length-1;
        while (arr[left]<arr[left+1]&&left<length-2){
            left++;
        }
        while (arr[right-1]>arr[right]&&right>1){
            right--;
        }
        return left==right;
    }
}
