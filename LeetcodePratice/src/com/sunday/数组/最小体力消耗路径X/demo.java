package com.sunday.数组.最小体力消耗路径X;

import org.junit.Test;

/**
 * 最小体力消耗路径
 *
 * 你准备参加一场远足活动。给你一个二维 rows x columns 的地图 heights ，其中 heights[row][col] 表示格子 (row, col) 的高度。一开始你在最左上角的格子 (0, 0) ，且你希望去最右下角的格子 (rows-1, columns-1) （注意下标从 0 开始编号）。你每次可以往 上，下，左，右 四个方向之一移动，你想要找到耗费 体力 最小的一条路径。
 *
 * 一条路径耗费的 体力值 是路径上相邻格子之间 高度差绝对值 的 最大值 决定的。
 *
 * 请你返回从左上角走到右下角的最小 体力消耗值 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-with-minimum-effort
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */

public class demo {

    @Test
    public void test(){

    }

    public int minimumEffortPath(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;
        boolean isGo = true;
        while (isGo) {
            isGo = false;
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    if (i - 1 >= 0) {
                        int x = Math.max(dp[i-1][j], Math.abs(arr[i][j] - arr[i-1][j]));
                        if (x < dp[i][j]) {
                            dp[i][j] = x;
                            isGo = true;
                        }
                    }
                    if (j - 1 >= 0) {
                        int x = Math.max(dp[i][j-1], Math.abs(arr[i][j] - arr[i][j-1]));
                        if (x < dp[i][j]) {
                            dp[i][j] = x;
                            isGo = true;
                        }
                    }
                }
            }
            for (int i=n-1; i>=0; i--) {
                for (int j=m-1; j>=0; j--) {
                    if (i + 1 < n) {
                        int x = Math.max(dp[i+1][j], Math.abs(arr[i][j] - arr[i+1][j]));
                        if (x < dp[i][j]) {
                            dp[i][j] = x;
                            isGo = true;
                        }
                    }
                    if (j + 1 < m) {
                        int x = Math.max(dp[i][j+1], Math.abs(arr[i][j] - arr[i][j+1]));
                        if (x < dp[i][j]) {
                            dp[i][j] = x;
                            isGo = true;
                        }
                    }
                }
            }
        }
        return dp[n-1][m-1];
    }
}
