package com.apple.leetcode;

public class LC206 {
    public static ListNode reverseList(ListNode head) {

        ListNode cur = head;
        ListNode next = null;

        while (cur.next != null) {
            next = cur.next;
            next.next = cur;
        }

        return cur;
    }

    public static void main(String[] args) {

    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}