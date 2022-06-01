package com.apple.leetcode;

public class LC007 {
    public static int solution(int x) {
        int res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution(1534236469));
    }
}
