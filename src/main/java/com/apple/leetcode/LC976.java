package com.apple.leetcode;

import java.util.Arrays;

public class LC976 {
    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; --i) {
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arrs = {2,1,2};
        System.out.println(largestPerimeter(arrs));
    }
}
