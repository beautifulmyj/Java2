package com.apple.leetcode;

public class LC122 {
    public static int maxProfit(int[] prices) {
        int maxP = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                maxP += prices[i + 1] - prices[i];
            }
        }

        return maxP;
    }

    public static void main(String[] args) {
        int[] stocks = {7,1,5,3,6,4};
        System.out.println(maxProfit(stocks));
    }
}
