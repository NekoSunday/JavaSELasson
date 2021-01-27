package com.sunday.数组.买卖股票的最佳时机;

import org.junit.Test;


/**
 *给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */

public class demo {
    @Test
    public void test() {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxProfit(int[] prices) {
        int currMaxProfit = 0;
        for (int i = 0, j = 0; j < prices.length; j++) {
            if (prices[j] - prices[i] < 0) {
                i = j;
            } else {
                currMaxProfit = Math.max(prices[j] - prices[i], currMaxProfit);
            }
        }
        return currMaxProfit;


       /* int max=0;
        int l=prices.length;
        int i;
        int j;
        for (i=0; i < l; i++) {
            for (j = i+1; j < l; j++) {
                if (prices[j] - prices[i] < 0 || prices[j]==prices[i]) {
                    break;
                }else{
                    max = Math.max(max, prices[j] - prices[i]);
                }

            }
        }
        return max;
        }*/
    }
}