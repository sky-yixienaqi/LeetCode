package com.lb.demo.leetcode.code;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/15 16:24
 * @Description:
 * @UpdateDate: 2020/1/15 16:24
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode1290 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(0);
        ListNode next2 = new ListNode(1);
        head.next = next1;
        next1.next = next2;

        System.out.println(getDecimalValue(head));
    }

    public static int getDecimalValue(ListNode head) {
        int res = 0;
        List<Integer> nodeValues = new ArrayList<>();
        do {
            nodeValues.add(head.val);
            head = head.next;
        } while (head != null);

        for(int i = nodeValues.size() - 1 ; i >= 0 ; i--){
            if(nodeValues.get(i) == 1){
                res += Double.valueOf(Math.pow(2, nodeValues.size() - 1 - i)).intValue();
            }
        }
        return res;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

