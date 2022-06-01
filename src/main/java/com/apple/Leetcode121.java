package com.apple;

public class Leetcode121 {
    public static int solution(int[] prices) {
        int maxProfit = 0;

        for(int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    maxProfit = Math.max((prices[j] - prices[i]), maxProfit);
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stocks = {7,1,5,3,6,4};
        System.out.println(solution(stocks));
    }
}
