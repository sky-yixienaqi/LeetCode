package com.lb.demo.leetcode.code;

/**
 * @Author: Liu Bo
 * @CreateDate: 2020/1/7 18:38
 * @Description:
 * @UpdateDate: 2020/1/7 18:38
 * @UpdateRemarke:
 * @Version: v1.0.0
 */
public class LeetCode1108 {

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(defangIPaddr("255.100.50.0"));
    }

    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

}
