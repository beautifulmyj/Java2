package com.apple.leetcode;

public class LC121 {
    public static int solution(int[] prices) {
        // TODO prices可能是null，还可能只有0、1个值
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length;i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(solution(prices));
    }
}
