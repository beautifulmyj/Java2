package com.apple.leetcode;

import java.util.ArrayList;
import java.util.Objects;

public class LC009 {
    public static boolean solution(int num) {
        if (num < 0) return false;
        ArrayList<Integer> integers = new ArrayList<>();
        while (num != 0) {
            integers.add(num % 10);
            num = num / 10;
        }

        int l = 0;
        int j = integers.size() - 1;

        while (l <= j) {
            if (Objects.equals(integers.get(l), integers.get(j))) {
                l++;
                j--;
            } else {
                break;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        solution(12345);
    }
}
