package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/17 11:58
 * @Description:
 * @UpdateDate: 2020/1/17 11:58
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode292 {

    public static void main(String[] args) {
        System.out.println(canWinNim(4));
    }

    public static boolean canWinNim(int n) {
        return !(n%4 == 0);
    }

}
