package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/15 17:10
 * @Description: 替身攻击
 * @UpdateDate: 2020/1/15 17:10
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }


    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
