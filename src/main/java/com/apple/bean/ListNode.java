package com.apple.bean;

public class ListNode {
    String val;
    ListNode next;

    public ListNode() {}

    public ListNode(String val) {
        this.val = val;
    }

    public ListNode(String val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
