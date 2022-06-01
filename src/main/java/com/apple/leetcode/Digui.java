package com.apple.leetcode;

public class Digui {
    static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int ret = 0;
        int pre = 2;
        int prepre = 1;
        for (int i = 3; i <= n; ++i) {
            ret = pre + prepre;
            prepre = pre;
            pre = ret;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
