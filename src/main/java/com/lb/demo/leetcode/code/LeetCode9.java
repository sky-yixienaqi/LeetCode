package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/7 14:05
 * @Description: leetCode 第九题 回文数
 * @UpdateDate: 2020/1/7 14:05
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode9 {

    public static void main(String[] args) {
        int test_a = 11211;
        int test_b = 23;
        System.out.println(isPalindrome(test_a));
        System.out.println(isPalindrome(test_b));
    }

    public static boolean isPalindrome(int x) {
        String reverseNumber = new StringBuilder(String.valueOf(x)).reverse().toString(); return reverseNumber.equals(String.valueOf(x));
    }

}
